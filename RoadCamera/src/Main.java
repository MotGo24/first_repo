import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //Parameters
        int maxOncomingSpeed =  30; // km/h
        int speedFineGrade = 20; // km/h
        int finePerGrade = 500; // km/h
        int criminalSpeed = 180; // km/h

        //==============================================

        System.out.println("Введите скорость автомобиля");
        int oncomingSpeed = new Scanner(System.in).nextInt();

        if (oncomingSpeed >= criminalSpeed) {
            System.out.println("Вызов полиции...");
        }  else if (oncomingSpeed > maxOncomingSpeed) {
            int overSpeed = oncomingSpeed - maxOncomingSpeed;
            int gradesCount = overSpeed / speedFineGrade;
            int fine = finePerGrade * gradesCount;
            System.out.println("Сумма штрафа = " + fine);
        } else {
            System.out.println("Скорость не превышена");
        }
    }
}