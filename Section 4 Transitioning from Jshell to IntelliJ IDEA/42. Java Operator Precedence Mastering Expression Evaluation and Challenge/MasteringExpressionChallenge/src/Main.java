//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        double myDouble = 20.00d;
        double myDouble2 = 80.00d;

        double myOperation = (myDouble2 + myDouble) * 100.00d;

        double opRemainder = myOperation % 40.00d;

        boolean remainderBool = opRemainder == 0;

        System.out.println("Is the remainder of the operation 0? " + remainderBool);

        if(remainderBool){
            System.out.println("Is the remainder of the operation is 0!");
        }
        else{
            System.out.println("Is the remainder of the operation is NOT 0!");
        }

    }
}