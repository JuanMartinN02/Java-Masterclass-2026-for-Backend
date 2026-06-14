import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Collection<String> list = new ArrayList<>();

        list.addAll(Arrays.asList("James", "Joe", "Gnar", "Albert", "George", "Gary", "Fred"));

        System.out.println(list);
        System.out.println("Is Gary on the list? " + list.contains("Gary"));

        list.removeIf(s -> s.charAt(0) == 'G');

        System.out.println("--------------------------------");
        System.out.println(list);
        System.out.println("Is Gary on the list? " + list.contains("Gary"));

        // Collection interface dont have sort
        // list.sort();

        
    }
}