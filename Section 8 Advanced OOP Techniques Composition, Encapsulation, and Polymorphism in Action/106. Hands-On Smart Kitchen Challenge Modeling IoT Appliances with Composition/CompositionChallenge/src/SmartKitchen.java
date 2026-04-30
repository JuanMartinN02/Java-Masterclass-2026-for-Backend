public class SmartKitchen {
    private CoffeeMaker brewMaster;
    private DishWasher dishWasher;
    private Refrigerator iceBox;

    public void setKitchenState(boolean coffee, boolean washer, boolean refrig){
        brewMaster.setHasWorkToDo(coffee);
        dishWasher.setHasWorkToDo(washer);
        iceBox.setHasWorkToDo(refrig);

        System.out.println("brewMaster " + (coffee ? "Has work to do!" : "Doesn't have work to do!"));
        System.out.println("DishWasher " + (washer ? "Has work to do!" : "Doesn't have work to do!"));
        System.out.println("Refrigerator " + (refrig ? "Has work to do!" : "Doesn't have work to do!"));
    }

    public void addWater(){
        brewMaster.setHasWorkToDo(true);
        System.out.println("brewMaster Has work to do!");
    }

    public void pourMilk(){
        iceBox.setHasWorkToDo(true);
        System.out.println("Refrigerator Has work to do!");
    }

    public void loadDishwasher(){
        dishWasher.setHasWorkToDo(true);
        System.out.println("dishWasher Has work to do!");
    }

    public void doWork(){
        if (brewMaster.isHasWorkToDo()){
            brewMaster.brewCoffee();
            brewMaster.setHasWorkToDo(false);
        }
        if (iceBox.isHasWorkToDo()){
            iceBox.orderFood();
            iceBox.setHasWorkToDo(false);
        }
        if (dishWasher.isHasWorkToDo()){
            dishWasher.doDishes();
            dishWasher.setHasWorkToDo(false);
        }
    }

    public SmartKitchen(CoffeeMaker brewMaster, DishWasher dishWasher, Refrigerator iceBox) {
        this.brewMaster = brewMaster;
        this.dishWasher = dishWasher;
        this.iceBox = iceBox;
    }

    public CoffeeMaker getBrewMaster() {
        return brewMaster;
    }

    public void setBrewMaster(CoffeeMaker brewMaster) {
        this.brewMaster = brewMaster;
    }

    public DishWasher getDishWasher() {
        return dishWasher;
    }

    public void setDishWasher(DishWasher dishWasher) {
        this.dishWasher = dishWasher;
    }

    public Refrigerator getIceBox() {
        return iceBox;
    }

    public void setIceBox(Refrigerator iceBox) {
        this.iceBox = iceBox;
    }
}
