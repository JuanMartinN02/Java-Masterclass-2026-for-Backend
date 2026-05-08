import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5};

        reverseArray(nums);

        System.out.println(Arrays.toString(nums));
    }

    public static void reverseArray(int[] nums){
        if (nums == null || nums.length == 1) return;

        int half = nums.length / 2;
        int right = nums.length - 1;

        for (int i = 0; i < half; i++){
            int temp = nums[i];
            nums[i] = nums[right];
            nums[right] = temp;

            right--;
        }
    }
}