//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static int getGreatestCommonDivisor(int first, int second){
        if(first < 10 || second < 10) return -1;

        int smallest = Math.min(first, second);

        for(int i = smallest; i > 0; i--){
            if( first % i == 0 && second % i == 0) return i;
        }
        return 1;
    }

    public static void main(String[] args) {
        System.out.println(getGreatestCommonDivisor(25, 15));
        System.out.println(getGreatestCommonDivisor(12, 30));
        System.out.println(getGreatestCommonDivisor(9, 18));
    }
}