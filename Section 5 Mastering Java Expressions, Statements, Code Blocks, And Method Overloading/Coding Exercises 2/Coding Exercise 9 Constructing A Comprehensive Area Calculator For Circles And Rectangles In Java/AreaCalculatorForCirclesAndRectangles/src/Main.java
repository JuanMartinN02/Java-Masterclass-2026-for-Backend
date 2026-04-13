//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static double area(double radius){
        if(radius < 0){
            return -1;
        }
        return (Math.pow(radius, 2) * Math.PI);
    }

    public static double area(double x, double y){
        if (x < 0 || y < 0){
            return -1;
        }
        return x * y;
    }

    public static void main(String[] args) {
        System.out.println(area(5.7));
        System.out.println(area(-1));
        System.out.println(area(5.7,3.7));
        System.out.println(area(-1, 6));
    }
}