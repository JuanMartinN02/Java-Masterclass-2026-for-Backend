//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void displayHighScorePosition(String playerName, int playerPosition){
        System.out.println("----------------------------------------------------------");
        System.out.println(playerName + " managed to get into position " +
                playerPosition + " on the high score list");
        System.out.println("");
    }

    public static int calculateHighScorePosition(int playerScore){
        if(playerScore >= 1000){
            return 1;
        } else if (playerScore >= 500) {
            return 2;
        } else if (playerScore >= 100) {
            return 3;
        } else {
            return 4;
        }
    }

    public static void main(String[] args) {
        displayHighScorePosition("Juan", calculateHighScorePosition(1500));

        displayHighScorePosition("Ama", calculateHighScorePosition(999));

        displayHighScorePosition("Julian", calculateHighScorePosition(500));

        displayHighScorePosition("Mario", calculateHighScorePosition(100));

        displayHighScorePosition("Marcos", calculateHighScorePosition(25));
    }


}