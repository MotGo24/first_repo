import java.util.Scanner;

public class CalorieCounterApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalCalories = 0;

        System.out.println("Добро пожаловать в приложение для подсчета калорий!");

        while (true) {
            System.out.println("\nВыберите действие:");
            System.out.println("1. Добавить калории");
            System.out.println("2. Просмотреть общее количество калорий");
            System.out.println("3. Выйти");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Введите количество калорий для добавления: ");
                    int caloriesToAdd = scanner.nextInt();
                    totalCalories += caloriesToAdd;
                    System.out.println("Калории добавлены!");
                    break;
                case 2:
                    System.out.println("Общее количество калорий: " + totalCalories);
                    break;
                case 3:
                    System.out.println("Спасибо за использование приложения!");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Пожалуйста, выберите действие 1, 2 или 3.");
                    break;
            }
        }
    }
}
