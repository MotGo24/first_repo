
public class Main {
    public static void main(String[] args) {
        int coffeeAmount = 2330;
        int milkAmount = 3210;
        int skimmedMilkAmount = 1290;

        boolean isBlocked = true;

        int cappucinoMilkRequired = 60;
        int cappucinoCoffeeRequired = 15;

        if (!isBlocked && milkAmount >= cappucinoMilkRequired &&
                coffeeAmount >= cappucinoCoffeeRequired) {
             System.out.println("готовим кофе");
        }  else {
            System.out.println( "Что-то пошло не так (");
        }
        }
    }
