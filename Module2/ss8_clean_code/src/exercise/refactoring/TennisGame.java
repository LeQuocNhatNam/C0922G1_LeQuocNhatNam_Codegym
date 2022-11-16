package exercise.refactoring;

public class TennisGame {
    public static String getScore(int scorePlayer1, int scorePlayer2) {
        final int ADVANTAGE = 1;
        final int WINGAP = 2;
        final int WINNINGSCORE = 4;

        StringBuilder score = new StringBuilder();
        int tempScore;
        if (scorePlayer1 == scorePlayer2) {
            switch (scorePlayer1) {
                case 0:
                    score = new StringBuilder("Love-All");
                    break;
                case 1:
                    score = new StringBuilder("Fifteen-All");
                    break;
                case 2:
                    score = new StringBuilder("Thirty-All");
                    break;
                case 3:
                    score = new StringBuilder("Forty-All");
                    break;
                default:
                    score = new StringBuilder("Deuce");
                    break;
            }

        } else if (scorePlayer1 >= WINNINGSCORE || scorePlayer2 >= WINNINGSCORE) {
            int minusResult = scorePlayer1 - scorePlayer2;
            if (minusResult == ADVANTAGE) {
                score = new StringBuilder("Advantage player1");
            } else if (minusResult == -ADVANTAGE) {
                score = new StringBuilder("Advantage player2");
            } else if (minusResult >= WINGAP) {
                score = new StringBuilder("Win for player1");
            } else {
                score = new StringBuilder("Win for player2");
            }

        } else {
            for (int i = 1; i < 3; i++) {
                if (i == 1) {
                    tempScore = scorePlayer1;
                } else {
                    score.append("-");
                    tempScore = scorePlayer2;
                }
                switch (tempScore) {
                    case 0:
                        score.append("Love");
                        break;
                    case 1:
                        score.append("Fifteen");
                        break;
                    case 2:
                        score.append("Thirty");
                        break;
                    case 3:
                        score.append("Forty");
                        break;
                }
            }
        }

        return "Player1 - Player2: " + score;
    }
}
