//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        calculateInterest(100);
    }

    public static void calculateInterest(double amount){
        for(double i = 7.5; i <= 10; i += 0.25){
            double interest = amount * (i / 100);
            System.out.println("Interest of " + i + "% of " + amount + "$ = " + interest + "$");
        }
    }
}