public class MethodOverloading {
    public static void main(String[] args) {

        int newScore = calculateScore("Kurt", 400);
        System.out.println("New score is " + newScore);

        calculateScore(800);

        calculateScore();
    }


    public static int calculateScore(String playerName, int playerScore) {
        System.out.println(playerName + " scored " + playerScore + " points");
        return playerScore * 1000;
    }

    public static void calculateScore(int playerScore) {
        System.out.println(calculateScore("Anonymous", 80));
    }

    public static int calculateScore() {
        System.out.println("Player and score not provided");
        return 0;
    }
}

