import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // Testing binary search (returns -1 if element is not found)
        String[]  names = new String[]{"Mark", "Juan", "Jose", "Fernando", "Alexander"};

        // Array needs to be sorted for binary search
        Arrays.sort(names);

        int answ = Arrays.binarySearch(names, "Juan");

        if(answ >= 0){
            System.out.println("Element found in Array!");
        }else {
            System.out.println("Element NOT found in the Array!");
        }


        int[] a1 = new int[]{1, 2, 3, 4, 5};
        int[] a2 = new int[]{1, 2, 3, 4, 5};
        int[] a3 = new int[]{1, 2, 3, 4, 5, 6};

        System.out.println(Arrays.equals(a1, a2));

        System.out.println(Arrays.equals(a1, a3));
    }
}