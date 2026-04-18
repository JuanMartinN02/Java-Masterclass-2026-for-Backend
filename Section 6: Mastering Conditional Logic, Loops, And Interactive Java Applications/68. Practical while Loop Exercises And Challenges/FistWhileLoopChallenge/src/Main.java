public class Main {

    public static boolean isEven(int number){
        if (number % 2 == 0) return true;
        return false;
    }

    public static void main(String[] args) {
        int counter = 5;

        while (counter <= 20){
            if (isEven(counter)){
                System.out.println(counter);
            }
            counter ++;
        }

    }
}