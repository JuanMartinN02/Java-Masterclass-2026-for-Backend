//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static boolean isPalindrome(int number){
        if (number < 0) number = number * -1;

        int newNumber = number;
        // We use a long so it cant be an overflow because the reverse of 1,000,000,009
        // is 9,000,000,001, which is not a doable int
        long reversed = 0;

        while (newNumber != 0){
            reversed = (reversed * 10) + (newNumber % 10);
            newNumber = newNumber / 10;
        }

        if (reversed == number) return true;
        return false;

    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(-1221));
        System.out.println(isPalindrome(707));
        System.out.println(isPalindrome(11212));
    }
}