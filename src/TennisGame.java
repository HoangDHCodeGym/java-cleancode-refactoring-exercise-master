public class TennisGame {

    public static final String LOVE_ALL = "Love-All";
    public static final String FIFTEEN_ALL = "Fifteen-All";
    public static final String THIRTY_ALL = "Thirty-All";
    public static final String FORTY_ALL = "Forty-All";
    public static final String DEUCE = "Deuce";
    public static final String LOVE = "Love";
    public static final String FIFTEEN = "Fifteen";
    public static final String THIRTY = "Thirty";
    public static final String FORTY = "Forty";
    public static final String ADVANTAGE_PLAYER_1 = "Advantage player1";
    public static final String ADVANTAGE_PLAYER_2 = "Advantage player2";
    public static final String WIN_FOR_PLAYER_1 = "Win for player1";
    public static final String WIN_FOR_PLAYER_2 = "Win for player2";

    public static String getScoreResult(String nameOfPlayer1, String nameOfPlayer2, int scoreOfPlayer1, int scoreOfPlayer2) {
        String score = "";
        int tempScore=0;
        if (scoreOfPlayer1==scoreOfPlayer2) {
            return getEqualScoreResult(scoreOfPlayer1);
        }
        else if (scoreOfPlayer1>=4 || scoreOfPlayer2>=4) {
            return getAdvantagePlayerResult(scoreOfPlayer1, scoreOfPlayer2);
        }
        else
        {
            return getScoreDifferencesResult(scoreOfPlayer1, scoreOfPlayer2);
        }
    }

    public static String getEqualScoreResult(int scoreOfPlayer1) {
        String scoreResult;
        switch (scoreOfPlayer1)
        {
            case 0:
                scoreResult = LOVE_ALL;
                break;
            case 1:
                scoreResult = FIFTEEN_ALL;
                break;
            case 2:
                scoreResult = THIRTY_ALL;
                break;
            case 3:
                scoreResult = FORTY_ALL;
                break;
            default:
                scoreResult = DEUCE;
                break;
        }
        return scoreResult;
    }

    public static String getAdvantagePlayerResult(int scoreOfPlayer1, int scoreOfPlayer2) {
        String scoreResult;
        int scoreDifference = scoreOfPlayer1-scoreOfPlayer2;

        if (scoreDifference == 1) {
            scoreResult = ADVANTAGE_PLAYER_1;
        }
        else if (scoreDifference == -1) {
            scoreResult = ADVANTAGE_PLAYER_2;
        }
        else if (scoreDifference >= 2) {
            scoreResult = WIN_FOR_PLAYER_1;
        }
        else {
            scoreResult = WIN_FOR_PLAYER_2;
        }
        return scoreResult;
    }

    public static String getPlayerScore(int playerScore) {
        String score = "";
        switch(playerScore)
        {
            case 0:
                score = LOVE;
                break;
            case 1:
                score = FIFTEEN;
                break;
            case 2:
                score =  THIRTY;
                break;
            case 3:
                score = FORTY;
                break;
        }
        return score;
    }

    private static String getScoreDifferencesResult(int scoreOfPlayer1, int scoreOfPlayer2) {
        return getPlayerScore(scoreOfPlayer1) + "-" + getPlayerScore(scoreOfPlayer2);
    }
}
