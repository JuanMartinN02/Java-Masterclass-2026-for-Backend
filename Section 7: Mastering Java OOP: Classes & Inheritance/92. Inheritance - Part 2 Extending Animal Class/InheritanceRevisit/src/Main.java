//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Animal cat = new Animal("Cat", "small", 5, "fast");

        Dog yorkie = new Dog(25, "fast", "Yorkie", true);

        doAnimalStuff(cat);
        System.out.println("------------");
        doAnimalStuff(yorkie);
    }

    public static void doAnimalStuff(Animal animal){
        System.out.println(animal);
        animal.makeNoise();
        System.out.println(animal.getType() + " does animal stuff. It's " + animal.getSize());
    }
}