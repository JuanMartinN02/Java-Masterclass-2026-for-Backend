public class Car {
    private String make;
    private String model;
    private String color;
    private int doors;
    private boolean electric;

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public boolean isElectric() {
        return electric;
    }

    public void setElectric(boolean electric) {
        this.electric = electric;
    }

    public void describe(){
        System.out.println("Make = " + this.make);
        System.out.println("Model = " + this.model);
        System.out.println("Color = " + this.color);
        System.out.println(this.electric ? "It's electric" : "It uses fuel");
        System.out.println("It has " + this.doors + " doors.");
    }
}
