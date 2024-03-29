public class FirstMethodChallenge {
    public static void main(String[] args) {
        String playerName = "Kurt";

        int playerPosition = calculateHighScorePosition(1500);
        displayHighScorePosition(playerName, playerPosition);

        playerPosition = calculateHighScorePosition(1000);
        displayHighScorePosition(playerName, playerPosition);

        playerPosition = calculateHighScorePosition(500);
        displayHighScorePosition(playerName, playerPosition);

        playerPosition = calculateHighScorePosition(100);
        displayHighScorePosition(playerName, playerPosition);

        playerPosition = calculateHighScorePosition(25);
        displayHighScorePosition(playerName, playerPosition);
    }

    public static void displayHighScorePosition(String playerName, int playerPosition) {
        System.out.println(playerName + " is in position " + playerPosition + " on the high score list");
    }

    public static int calculateHighScorePosition(int playerScore) {

        int position = 4;
        if (playerScore >= 1000) {
            position = 1;
        } else if (playerScore >= 500) {
            position = 2;
        } else if (playerScore >= 100) {
            position = 3;
        }

        return position;
    }
}
