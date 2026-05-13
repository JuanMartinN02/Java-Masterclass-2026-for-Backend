import java.util.ArrayList;
import java.util.Arrays;

record GroceryItem(String name, String type, int count){
    public GroceryItem(String name){
        this(name, "Diary", 1);
    }

    @Override
    public String toString() {
        return String.format("%d %s in the %s section", count, name, type);
    }
}

public class Main {
    public static void main(String[] args) {

        GroceryItem[] groceryArray = new GroceryItem[5];
        groceryArray[0] = new GroceryItem("Milk");
        groceryArray[1] = new GroceryItem("Banana", "Produce", 15);
        groceryArray[2] = new GroceryItem("Steak", "Butcher", 30);

        System.out.println(Arrays.toString(groceryArray));

        //Now with array list, which doesn't have a fixed length
        ArrayList<GroceryItem> groceryList = new ArrayList<>();
        groceryList.add(new GroceryItem("Butter"));
        groceryList.add(new GroceryItem("Candy", "General", 5));
        groceryList.add(new GroceryItem("Cereal", "Grains", 1));

        //Adding to the start. We can specify index position
        groceryList.add(0, new GroceryItem("Bread", "General", 2));

        System.out.println(groceryList.toString());

        //We can remove by index
        groceryList.remove(1);

        System.out.println();
        System.out.println(groceryList.toString());
    }
}