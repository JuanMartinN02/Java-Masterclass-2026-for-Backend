import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void inputThenPrintSumAndAverage(){
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        double currentAvg = (double) 0;
        int counter = 0;

        while (true){
            String currentNum = scanner.nextLine();

            try {
                counter ++;
                int validNum = Integer.parseInt(currentNum);
                sum += validNum;
                currentAvg = sum / counter;

            } catch (NumberFormatException nfe){
                System.out.println("SUM = " + sum + " AVG = " + Math.round(currentAvg));
                break;
            }
        }
    }

    public static void main(String[] args) {
        inputThenPrintSumAndAverage();
    }
}