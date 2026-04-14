//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int testValue = 3;

        switch (testValue){
            case 1:
                System.out.println("It was a 1");
                break;
            case 2:
                System.out.println("It was a 2");
                break;
            case 3: case 4: case 5:
                System.out.println("It was a 3, 4 or 5");
                System.out.println("Actually, it was a " + testValue);
                break;
            default:
                System.out.println("It wasn't a 1, 2, 3, 4 or 5!");
                break;
        }
    }
}