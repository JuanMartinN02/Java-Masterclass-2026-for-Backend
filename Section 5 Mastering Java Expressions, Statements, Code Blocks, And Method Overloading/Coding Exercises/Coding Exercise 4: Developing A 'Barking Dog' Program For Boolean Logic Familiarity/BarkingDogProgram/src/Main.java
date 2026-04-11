//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static boolean shouldWakeUp(boolean barking, int hourOfDay){
        if(hourOfDay < 0 || hourOfDay > 23 || barking == false){
            return false;
        } else if (hourOfDay <= 22 && hourOfDay >= 8) {
            return false;
        }else return true;
    }

    public static void main(String[] args) {
        System.out.println(shouldWakeUp(true, 1));
        System.out.println(shouldWakeUp(false, 2));
        System.out.println(shouldWakeUp(true, 8));
        System.out.println(shouldWakeUp(true, -1));
    }
}