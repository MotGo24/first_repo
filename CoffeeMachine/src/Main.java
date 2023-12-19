
public class Main {
    public static void main(String[] args) {
        int coffeeAmount = 2330;
        int milkAmount = 3210;
        int SkimmedMilkAmount = 1290;



        int cappucinoMilkRequired = 60;
        int cappucinoCoffeeRequired = 15;

        if (coffeeAmount >= cappucinoCoffeeRequired &&
        milkAmount >= cappucinoMilkRequired) {
             System.out.println("Готовим капучино");
        }  else {
            System.out.println( "Ингедиентов недосточно недостаточно :(");
        }
        }
    }
