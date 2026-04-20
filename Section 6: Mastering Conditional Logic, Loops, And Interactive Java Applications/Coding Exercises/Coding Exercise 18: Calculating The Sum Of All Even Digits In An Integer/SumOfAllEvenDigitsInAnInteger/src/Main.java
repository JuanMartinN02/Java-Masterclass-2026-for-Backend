//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static long sumFirstAndLastDigit(int number){
        if (number < 0) return -1;

        int firstNumber = number % 10;
        int newNumber = number;
        long reversed = 0;

        while (newNumber != 0){
            reversed = (reversed * 10) + (newNumber % 10);
            newNumber = newNumber / 10;
        }

        long lastNumber = reversed % 10;

        System.out.println(reversed);

        return (firstNumber + lastNumber);
    }

    public static void main(String[] args) {
        System.out.println(sumFirstAndLastDigit(2147483647));
    }
}