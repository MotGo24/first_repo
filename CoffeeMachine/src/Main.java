
public class Main {
    public static void main(String[] args) {
        int CoffeeAmount = 2330;
        int MilkAmount = 3210;
        int SkimmedMilkAmount = 1290;

        boolean IsBlocked = true;

        int CappucinoMilkRequired = 60;
        int CappucinoCoffeeRequired = 15;

        boolean milkIsEnough = SkimmedMilkAmount >= CappucinoMilkRequired ||
                MilkAmount >= CappucinoMilkRequired;

        boolean coffeIsEnough = CoffeeAmount >= CappucinoMilkRequired;

        boolean hasErrors = false;

        if (IsBlocked) {
            System.out.println("Кофе-машина заблокирована   ");
             hasErrors = true;
        }  if (!coffeIsEnough) {
                System.out.println("Кофе недостаточно");
                hasErrors = true;
            } if (!milkIsEnough) {
                System.out.println("Молока недостаточно");
                hasErrors = true;
            }

        if (!hasErrors ) {
            System.out.println("Готовим кофе");
        }
    }
}