import java.util.function.Consumer;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) {

        // First challenge
        Consumer<String> printWordsLambda = sentence -> {
            String[] splitted = sentence.split(" ");
            for(String word: splitted){
                System.out.println(word);
            }
        };

        printWordsLambda.accept("Hello World.");

        // Second challenge
        Function<String, String> everySecondCharactedLambda = source -> {
            StringBuilder returnVal = new StringBuilder();
            for(int i = 0; i < source.length(); i++){
                if(i % 2 == 1){
                    returnVal.append(source.charAt(i));
                }
            }
            return returnVal.toString();
        };

        System.out.println(everySecondCharactedLambda.apply("123456789"));

    }
}