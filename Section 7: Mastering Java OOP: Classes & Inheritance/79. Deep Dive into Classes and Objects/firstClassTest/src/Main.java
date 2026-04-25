//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Car car = new Car();

        car.describe();

        System.out.println("");

        car.setColor("Blue");
        car.setDoors(2);
        car.setMake("BMW");
        car.setModel("X5 xDrive50e");
        car.setElectric(false);
        car.describe();
    }
}