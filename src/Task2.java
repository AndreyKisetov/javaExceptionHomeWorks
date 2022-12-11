public class Task2 {
    // Посмотрите на код, и подумайте сколько разных типов исключений вы тут сможете получить?
    public static void main(String[] args) {
        String[][] numbs = {{"2", "0", "0", "2", "0"}, {"0", "2", "1", "5", "1"}};
        System.out.println(sum2d(numbs));
    }

    public static int sum2d(String[][] arr) {
        if (arr == null) {
            throw new RuntimeException("Массив не может быть NULL");
        }
        if (arr[0].length < 5) {
            throw new ArrayIndexOutOfBoundsException("Количество столбцов должно быть не менее 5!");
        }
        int sum = 0;
        int i = 0;
        while (i < arr.length) {
            for (int j = 0; j < 5; j++) {
                if (!arr[i][j].matches("\\d+")) {
                    throw new NumberFormatException("Списоки должны состоять только из целочисленных значений.");
                }
                int val = Integer.parseInt(arr[i][j]);
                sum += val;
            }
            i++;
        }
        return sum;
    }
}
