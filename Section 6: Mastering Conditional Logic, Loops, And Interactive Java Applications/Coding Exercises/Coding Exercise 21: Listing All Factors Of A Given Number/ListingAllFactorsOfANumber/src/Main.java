//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void printFactors(int number){
        if (number < 1){
            System.out.println("Invalid Value");
            return;
        }

        for(int i = 1; i <= number / 2; i++){
            if(number % i == 0) System.out.println(i);
        }
        System.out.println(number);
    }

    public static void main(String[] args) {
        printFactors(32);
    }
}