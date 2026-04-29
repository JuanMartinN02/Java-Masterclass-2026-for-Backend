//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // better way to integrate characters into prints and format them
        int number = 70;

        System.out.printf("The int is %d%n", number);
        System.out.printf("int into double with 2 decimals %.2f", (float) number);

        String stringExample = "Test String";
        System.out.printf("Length of string = %d%n", stringExample.length());
        System.out.printf("Sixth char = %c%n", stringExample.charAt(5));
        System.out.printf("Last char = %c%n", stringExample.charAt(stringExample.length() - 1));
    }
}