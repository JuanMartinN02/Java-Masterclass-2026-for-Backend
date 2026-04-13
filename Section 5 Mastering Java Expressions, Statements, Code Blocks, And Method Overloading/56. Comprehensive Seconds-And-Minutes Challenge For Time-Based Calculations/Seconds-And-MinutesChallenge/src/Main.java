//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static String getDurationString(int seconds){
        if(seconds < 0){
            return "Error, invalid input. Must be a positive integer.";
        }

        int newHours = seconds / 3600;
        int newMinutes = (seconds % 3600) / 60;
        int newSeconds = seconds % 60;

        return (newHours + "h " + newMinutes + "m " + newSeconds + "s");
    }

    public static String getDurationString(int minutes, int seconds){
        if(minutes < 0 && seconds < 60 && seconds > 0){
            return "Error, invalid input. Must be a positive integer and seconds shouldn't exceed 60s";
        }

        int newSeconds = (minutes * 60) + seconds;

        return getDurationString(newSeconds);
    }

    public static void main(String[] args) {
        System.out.println(getDurationString(5023423));
        System.out.println(getDurationString(5023, 54));
    }
}