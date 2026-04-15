//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        for (int i = 2; i <= 1000; i++){
            if (isPrime(i)) System.out.println(i + " is a prime number!");
        }
    }

    public static boolean isPrime(int wholeNumber){
        if (wholeNumber <= 1) return false;

        for(int i = 2; i * i <= wholeNumber; i++) {
            if (wholeNumber % i == 0) return false;
        }
        return true;
    }

}