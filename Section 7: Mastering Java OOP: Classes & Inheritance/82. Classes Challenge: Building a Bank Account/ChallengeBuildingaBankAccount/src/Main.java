//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        BankAccount juan = new BankAccount(29577475, 120000, "Juan Martin", "juannogueiram@gmail.com", "4129935433");

        System.out.println("");
        juan.withraw(300000);
        System.out.println("");
        juan.withraw(30000);
        System.out.println("");
        juan.deposit(1200000);
        System.out.println("");
        System.out.println(juan.toString());
    }
}