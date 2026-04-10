//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        int finalScore = score;

        if(gameOver){
            finalScore += (bonus * levelCompleted);
            System.out.println("Your final score was: " + finalScore);
        }




//        boolean newGameOver = true;
//        int newScore = 10_000;
//        int newLevelCompleted = 8;
//        int newBonus = 200;
//
//        int newFinalScore = newScore;
//
//        if(newGameOver){
//            newFinalScore += (newBonus * newLevelCompleted);
//            System.out.println("Your final score was: " + newFinalScore);
//        }


    }
}