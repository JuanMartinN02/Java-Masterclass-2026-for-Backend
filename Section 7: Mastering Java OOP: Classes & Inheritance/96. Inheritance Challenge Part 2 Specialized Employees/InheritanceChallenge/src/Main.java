//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Employee juan = new Employee("02/26/2025");
        Employee jose = new Employee("Jose", "03/22/2002", "04/23/2020");
        SalariedEmployee ama = new SalariedEmployee("Ama", "10/21/2003", "03/22/2020", 120000);
        //String name, String birthDate, String hireDate, double annualSalary

        System.out.println(juan.toString());
        System.out.println(jose.toString());
        System.out.println(ama.toString());
        System.out.println(ama.collectPay());
    }
}