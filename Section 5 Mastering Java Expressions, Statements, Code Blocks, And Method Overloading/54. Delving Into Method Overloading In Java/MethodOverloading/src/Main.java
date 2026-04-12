//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        calculateScore("Juan", 160);
        calculateScore(250);
    }

    public static int calculateScore(String player, int points){
        int score = points * 1500;
        System.out.println(player + " Scored = " + score);
        return score;
    }

    // Same method name and return type but different parameters
    public static int calculateScore(int points){
        int score = calculateScore("AnonPlayer", points);
        return score;
    }

    // Doesn't work because the return type is different
    /* public static void calculateScore(String player, int points){
        int score = points * 1500;
        System.out.println(player + " Scored = " + score);
    }*/

}