import java.util.*;

public class Task1 {
    // Реализуйте 3 метода, чтобы в каждом из них получить разные исключения
    public static void main(String[] args) {
        System.out.println("Введите два числа: ");
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("число1: ");
            int num1 = sc.nextInt();

            System.out.println("число2: ");
            int num2 = sc.nextInt();

            int dividedNum = num1 / num2;

            System.out.println("Результат после деления: " + dividedNum);

        } catch (Exception e) {
            if (e instanceof InputMismatchException) {
                throw new InputMismatchException("Необходимо вводить цифру.");
            } else if (e instanceof ArithmeticException) {
                throw new ArithmeticException("На 0 делить нельзя.");
            } else {
                throw new IllegalArgumentException("Пожалуйста, попробуйте еще раз!");
            }
        }
    }
}
