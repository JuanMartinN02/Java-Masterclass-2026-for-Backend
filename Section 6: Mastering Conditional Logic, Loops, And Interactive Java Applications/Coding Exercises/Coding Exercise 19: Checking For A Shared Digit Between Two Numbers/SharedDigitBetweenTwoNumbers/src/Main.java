//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static boolean hasSharedDigit(int number1, int number2){
        if (number1 < 10 || number1 > 99 || number2 < 10 || number2 > 99 ) return false;

        int digit1 = number1 % 10;
        int digit2 = (number1 / 10) % 10;
        int digit3 = number2 % 10;
        int digit4 = (number2 / 10) % 10;

        return (digit1 == digit3 || digit1 == digit4 || digit2 == digit3 || digit2 == digit4);
    }

    public static void main(String[] args) {
        System.out.println(hasSharedDigit(12,23));
        System.out.println(hasSharedDigit(9,99));
        System.out.println(hasSharedDigit(15,55));
    }
}