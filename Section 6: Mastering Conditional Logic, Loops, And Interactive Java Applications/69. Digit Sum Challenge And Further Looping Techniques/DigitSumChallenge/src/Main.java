//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static int sumDigits(int number){
        int sum = 0;

        if (number <= 0)return -1;

        int newNumber = number;
        while (newNumber != 0){
            sum += newNumber % 10;
            newNumber = newNumber / 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sumDigits(1234567));
    }
}