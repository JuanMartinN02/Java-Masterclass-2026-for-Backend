//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static boolean hasTeen(int num1, int num2, int num3){
        if(num1 <= 19 && num1 >= 13 || num2 <= 19 && num2 >= 13 || num3 <= 19 && num3 >= 13){
            return true;
        }
        return  false;
    }

    public static boolean isTeen(int num){
        if(num <= 19 && num >= 13){
            return true;
        }
        return  false;
    }

    public static void main(String[] args) {
        System.out.println(hasTeen(9,99,19));
        System.out.println(hasTeen(23,17,42));
        System.out.println(hasTeen(22,24,34));
    }
}