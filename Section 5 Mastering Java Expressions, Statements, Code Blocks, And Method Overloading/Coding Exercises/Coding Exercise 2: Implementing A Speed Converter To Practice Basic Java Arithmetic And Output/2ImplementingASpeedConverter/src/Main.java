//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static long toMilesPerHour(double kilometerPerHour){
        if (kilometerPerHour < 0){
            return -1;
        }
        return Math.round((kilometerPerHour / 1.609));
    }

    public static void printConversion(double kilometerPerHour){
        long conversion = toMilesPerHour(kilometerPerHour);

        if(conversion < 0){
            System.out.println("Invalid Value");
        }else{
            System.out.println(kilometerPerHour + " km/h = " + conversion + " mi/h");
        }
    }

    public static void main(String[] args) {
        printConversion(150);
        printConversion(70);
        printConversion(-1);
    }
}