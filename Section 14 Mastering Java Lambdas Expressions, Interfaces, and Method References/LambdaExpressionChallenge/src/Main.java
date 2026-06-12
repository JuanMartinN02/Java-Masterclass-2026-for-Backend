import javax.print.DocFlavor;
import java.awt.image.AreaAveragingScaleFilter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();

        String[] names = {"Juan", "Jose", "Alberto", "Bob", "Mauricio", "Anna"};

        Arrays.setAll(names,
                i -> names[i].toUpperCase()
                );

        Consumer<String> changeRandomChar = word -> {

        };

        Arrays.setAll(names,
                i -> changeRandomString(names[i])
        );

        System.out.println(Arrays.toString(names));

        Arrays.setAll(names,
                i -> addLastName(names[i])
                );

        System.out.println(Arrays.toString(names));

        ArrayList<String> namesList = new ArrayList<>(Arrays.asList("Juan", "Jose", "Alberto", "Bob", "Mauricio", "Anna"));

        namesList.replaceAll(name -> {
            String upper = name.toUpperCase();
            String withLast = addLastName(upper);
            return compareLastName(withLast);
        });

        System.out.println(namesList);

    }

    public static char getRandomChar(char startChar, char endChar){
        Random random = new Random();
        return (char) random.nextInt((int) startChar, (int) endChar +1 );
    }

    public static String changeRandomString(String name){
        Random random = new Random();

        StringBuilder ns = new StringBuilder(name);

        int index = random.nextInt(0, name.length());

        ns.setCharAt(index, getRandomChar('A', 'Z'));

        return ns.toString();
    }

    public static String addLastName(String name){
        StringBuilder ns = new StringBuilder(name);
        ns.append(' ');

        for(int i = name.length() - 1; i >= 0; i--){
            ns.append(name.charAt(i));
        }

        return ns.toString();
    }

    public static String compareLastName(String name){
        if (name == null || name.isBlank()) {
            return name;
        }

        String[] splitted = name.split(" ");

        if (splitted.length >= 2) {
            if (splitted[0].equalsIgnoreCase(splitted[1])) {
                return splitted[0];
            }
        }

        return name;
    }


}