import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String[] items = {"Apple", "Bannana", "Chocolate"};

        // I can create a list of the elements in the items array
        List<String> list = List.of(items);
        System.out.println(list);

        // I can then pass this list to a ArrayList. So I can populate and ArrayList with a List.
        ArrayList<String> groceryList = new ArrayList<>(list);
        groceryList.add("Yogurt");

        System.out.println(groceryList.toString());

        // I can also join two ArrayLists (or better said, add all objects from one ArrayList to another one)
        ArrayList<String> randomItems = new ArrayList<>(List.of("Shampoo", "Soap", "Toothbrush"));

        groceryList.addAll(randomItems);

        System.out.println();
        System.out.println(groceryList.toString());

        // Getting specific indexes
        System.out.println("Third element of the ArrayList = " + groceryList.get(2));

        // Checking for a value inside the ArrayList
        if(groceryList.contains("Yogurt")){
            System.out.println();
            System.out.println("Grocery list has yogurt");
        }

        // Getting indexes
        groceryList.add("Yogurt");
        System.out.println(groceryList.toString());
        System.out.println("First yogurt = " + groceryList.indexOf("Yogurt"));
        System.out.println("Last yogurt = " + groceryList.lastIndexOf("Yogurt"));

        // We can remove specific objects and even lists of objects
        groceryList.removeAll(List.of("Yogurt", "Shampoo"));

        System.out.println();
        System.out.println(groceryList.toString());

        // Or we can retain only certain objects
        groceryList.retainAll(List.of("Chocolate", "Apple"));

        System.out.println();
        System.out.println(groceryList.toString());

    }
}