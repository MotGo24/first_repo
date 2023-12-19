import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        for (;;) {
            System.out.println("Введите первое число");
            int Value1 = new Scanner(System.in).nextInt();
            System.out.println("Введите второе число");
            int Value2 = new Scanner(System.in).nextInt();
            int result = Value1 * Value2;
            System.out.println("Произведение чисел равно:" + result);
        }
    }
}