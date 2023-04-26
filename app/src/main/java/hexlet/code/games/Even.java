package hexlet.code.games;

public class Even implements Game {
    public final int INITIAL_RANGE = 1;
    public final int END_RANGE = 100;
    public final int SIZE_ARRAY = 2;
    public String getTask() {
        return "Answer 'yes' if the number is even, otherwise answer 'no'.";
    }
    public String[] getDataPair() {
        String[] messageGame = new String[SIZE_ARRAY];
        int genValue = INITIAL_RANGE + (int) (Math.random() * END_RANGE + 1);
        messageGame[0] = Integer.toString(genValue);
        String correctAnswer = checkEven(genValue);
        messageGame[1] = correctAnswer;
        return messageGame;
    }

    public String checkEven(int value) {
        return value % 2 == 0 ? "yes" : "no";
    }
}
