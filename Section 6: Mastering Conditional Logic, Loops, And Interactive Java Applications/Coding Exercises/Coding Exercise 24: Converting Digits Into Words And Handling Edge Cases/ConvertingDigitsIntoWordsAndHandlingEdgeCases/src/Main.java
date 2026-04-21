//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void numberToWords(int number){
        if (number < 0){
            System.out.println("Invalid Value");
            return;
        }

        int reversed = reverse(number);
        int currentDigit = reversed % 10;
        int digitCount = getDigitCount(number);

        for (int i = 0; i < digitCount; i++){
            switch (currentDigit) {
                case 0 -> {
                    System.out.println("Zero");
                }
                case 1 -> {
                    System.out.println("One");
                }
                case 2 -> {
                    System.out.println("Two");
                }
                case 3 -> {
                    System.out.println("Three");
                }
                case 4 -> {
                    System.out.println("Four");
                }
                case 5 -> {
                    System.out.println("Five");
                }
                case 6 -> {
                    System.out.println("Six");
                }
                case 7 -> {
                    System.out.println("Seven");
                }
                case 8 -> {
                    System.out.println("Eight");
                }
                case 9 -> {
                    System.out.println("Nine");
                }
            }
            reversed = reversed / 10;
            currentDigit = reversed % 10;
        }
    }

    public static int reverse(int number){
        int newNumber = number;
        int reversed = 0;

        while (newNumber != 0){
            reversed = (reversed * 10) + (newNumber % 10);
            newNumber = newNumber / 10;
        }
        return reversed;
    }

    public static int getDigitCount(int number){
        if (number < 0) return -1;

        int counter = 0;
        int newNumber = number;

        if (number == 0) return 1;

        while (newNumber != 0){
            counter ++;
            newNumber = newNumber / 10;
        }
        return counter;
    }

    public static void main(String[] args) {
        numberToWords(100234);
        System.out.println(reverse(-12133));
    }
}