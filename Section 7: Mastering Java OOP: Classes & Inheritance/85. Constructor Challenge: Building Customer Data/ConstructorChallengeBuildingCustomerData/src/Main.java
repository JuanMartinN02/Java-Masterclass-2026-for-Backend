//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {



    public static void main(String[] args) {
        Customer customer1 = new Customer("Juan", 50000, "juan@gmail.com");
        Customer customer2 = new Customer();
        Customer customer3 = new Customer("Jose", "josesito@yahoo.com");

        System.out.println(customer1.toString());
        System.out.println(customer2.toString());
        System.out.println(customer3.toString());
    }
}