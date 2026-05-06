import java.util.Arrays;
import java.util.Random;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int[] nums = new int[]{120, 12, 59, 32, 12, 12, 90, 100};

        int[] sortedNums = arraySort(nums);

        System.out.println(Arrays.toString(sortedNums));

    }

    public static int[] randomArray(int len){
        Random random = new Random();

        int[] nums = new int[len];

        for (int i = 0; i < len; i++){
            nums[i] = random.nextInt(101);
        }

        return nums;
    }

    // I used a selection sort, bubble sort is better in cases with fewer swaps...
    // .sort() uses quicksort (n log n) which is alot faster because it uses pivoting.
    public static int[] arraySort(int[] array){
        int[] finalArray = Arrays.copyOf(array, array.length);

       for (int j = 0; j < finalArray.length; j++) {
            int maxIndex = j;

            for (int i = j + 1; i < finalArray.length; i++) {
                if (finalArray[i] > finalArray[maxIndex]){
                    maxIndex = i;
                }
            }
            System.out.println(Arrays.toString(finalArray));
            int temp = finalArray[j];
            finalArray[j] = finalArray[maxIndex];
            finalArray[maxIndex] = temp;

        }
        return finalArray;
    }

    }
