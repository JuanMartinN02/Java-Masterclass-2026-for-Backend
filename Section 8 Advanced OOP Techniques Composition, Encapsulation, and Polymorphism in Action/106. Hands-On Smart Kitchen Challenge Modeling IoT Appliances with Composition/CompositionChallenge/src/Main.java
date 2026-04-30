//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        DishWasher dishWasher = new DishWasher(false);
        Refrigerator refrigerator = new Refrigerator(false);
        CoffeeMaker coffeeMaker = new CoffeeMaker(false);

        SmartKitchen smartKitchen = new SmartKitchen(coffeeMaker, dishWasher, refrigerator);

        smartKitchen.addWater();
        smartKitchen.loadDishwasher();

        smartKitchen.doWork();

        smartKitchen.pourMilk();

        smartKitchen.doWork();
        System.out.println();
        smartKitchen.setKitchenState(true, true, true);
        smartKitchen.doWork();
    }
}