public class Animal {
    private String type;
    protected String size;
    private double weight;
    protected String speed;

    public Animal(String type, String size, double weight, String speed) {
        this.type = type;
        this.size = size;
        this.weight = weight;
        this.speed = speed;
    }

    public Animal() {
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getSpeed() {
        return speed;
    }

    public void setSpeed(String speed) {
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "type='" + type + '\'' +
                ", size='" + size + '\'' +
                ", weight=" + weight +
                ", speed='" + speed + '\'' +
                '}';
    }

    public void makeNoise(){
        System.out.println(this.type + " Makes noise!");
    }

    public void move(){
        System.out.println(this.type + " moves " + this.speed);
    }
}
