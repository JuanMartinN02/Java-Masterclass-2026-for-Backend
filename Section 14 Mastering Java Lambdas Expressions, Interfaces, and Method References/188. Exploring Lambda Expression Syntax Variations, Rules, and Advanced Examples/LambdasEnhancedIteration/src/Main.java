import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>(Arrays.asList("Bravo", "Alpha", "Charlie"));

        for( String s : list){
            System.out.println(s);
        }

        System.out.println("-".repeat(20));

        list.forEach(s -> System.out.println(s));

        System.out.println("-".repeat(20));

        list.forEach((String myString) -> {
            char first = myString.charAt(0);
            System.out.println(myString + " means " + first);
        });


    }
}