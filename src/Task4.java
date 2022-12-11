import java.util.*;

public class Task4 {

    public static void main(String[] args) {
        int[] numbs = {2, 0, 2};
        int[] numbs2 = {2, 3, 0};
        System.out.println(Arrays.toString(diff2d(numbs, numbs2)));
    }

    public static String[] diff2d(int[] array, int[] array2) {
        if (array == null && array2 == null) {
            throw new RuntimeException("Массив не может быть NULL");
        }
        if (array.length != array2.length) {
            throw new ArrayIndexOutOfBoundsException("Количество элементов массива должно быть одинаковым");
        }
        String[] result = new String[array.length];
        for (int i = 0; i < array.length; i++) {
//            if (!array[i].matches("\\d+")) {
//                throw new NumberFormatException("Списоки должны состоять только из целого числа");
//            }
//            if (!array2[i].matches("\\d+")) {
//                throw new NumberFormatException("Списоки должны состоять только из целого числа");
//            }
            if (!(array2[i] == 0)) {
                throw new ArithmeticException("На 0 делить нельзя.");
            }
            String c = String.valueOf(array[i] / array2[i]);
            result[i] = c;
        }
        return result;
    }
}
