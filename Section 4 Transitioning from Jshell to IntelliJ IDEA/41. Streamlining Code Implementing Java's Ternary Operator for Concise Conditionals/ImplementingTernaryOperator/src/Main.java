//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        String makeOfCar = "Volkswagen";

        // Ternary operator
        boolean isDomestic1 = makeOfCar == "Volkswagen" ? false : true;

        // Much simpler way of writing this code
        boolean isDomestic2 = makeOfCar == "Volkswagen" ? false : true;

        if(isDomestic2){
            System.out.println("The car is domestic!");
        }
        else {
            System.out.println("The car is not domestic!");
        }


        // Ternary operator test 2
        int clientAge = 20;

        String ageText = clientAge >= 18 ? "Over Eighteen" : "Under Eighteen";

        System.out.println("Client is " + ageText);


    }
}