//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static int getEvenDigitSum(int number){
        if (number < 0) return -1;

        int newNumber = number;
        int currentNumber = 0;
        int evenCounter = 0;

        while (newNumber != 0){
            currentNumber = newNumber % 10;

            if (currentNumber % 2 == 0) evenCounter += currentNumber;

            newNumber = newNumber / 10;
        }

        return evenCounter;
    }

    public static void main(String[] args) {
        System.out.println(getEvenDigitSum(123456789));
        System.out.println(getEvenDigitSum(252));
        System.out.println(getEvenDigitSum(-22));
    }
}