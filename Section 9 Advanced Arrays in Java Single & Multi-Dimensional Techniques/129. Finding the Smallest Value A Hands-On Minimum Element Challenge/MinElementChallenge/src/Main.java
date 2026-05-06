import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] testArray = readIntegers();
        int min = findMin(testArray);

        System.out.println(Arrays.toString(testArray));
        System.out.println(min);

    }

    public static int[] readIntegers(){
        Scanner scanner = new  Scanner(System.in);
        System.out.println("Enter integeres separated by comas:");
        String input = scanner.nextLine();

        String[] stringArray = input.split(", ");

        int[] intArray = new int[stringArray.length];

        for (int i = 0; i < intArray.length; i++){
            intArray[i] = Integer.parseInt(stringArray[i]);
        }

        return intArray;
    }

    public static int findMin(int[] array){
        int min = array[0];

        for (int i = 0; i < array.length; i++){
            if (array[i] < min){
                min = array[i + 1];
            }
        }

        return min;
    }

}