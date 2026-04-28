public class Dog extends Animal{

    private String bread;
    private boolean pedigree;

    public Dog(double weight, String speed, String bread, boolean pedigree) {
        super("Dog", weight < 15 ? "small" : (weight < 35 ? "medium" : "large") , weight, speed);
        this.bread = bread;
        this.pedigree = pedigree;

    }

    public Dog() {
        super("Mutt", "Medium", 50, "Fast");
    }

    @Override
    public void makeNoise() {
        bark();
        walk();
        wagTail();
    }

    @Override
    public String toString() {
        return "Dog{" +
                "bread='" + bread + '\'' +
                ", pedigree=" + pedigree +
                "} " + super.toString();
    }

    private void walk(){
        System.out.println(this.bread + " walks " + this.speed);
    }

    private void bark(){
        System.out.println(this.bread + " barks!");
    }

    private void wagTail(){
        System.out.println(this.bread + " wags it's tail!");
    }
}
