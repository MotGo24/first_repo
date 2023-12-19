import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int sum = 0;

        int value = -1;
        while (value != 0) {
             value =  new Scanner(System.in).nextInt();
            sum = sum + value;
        }

        System.out.println("Сумма введенных чисел равна :" + sum);

        }

}