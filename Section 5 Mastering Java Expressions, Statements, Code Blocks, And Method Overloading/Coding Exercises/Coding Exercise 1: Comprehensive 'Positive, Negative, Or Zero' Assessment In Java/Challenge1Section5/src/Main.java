//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void checkNumber(int number){
        if(number == 0){
            System.out.println("zero");
        } else if (number < 0) {
            System.out.println("negative");
        }else{
            System.out.println("positive");
        }
    }

    public static void main(String[] args) {
        checkNumber(0);
        checkNumber(1);
        checkNumber(-5000);
    }
}