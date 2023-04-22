package hexlet.code.games;

public class Gcd {
    public static final int INITIAL_RANGE = 1;
    public static final int END_RANGE = 100;
    public static final int SIZE_ARRAY = 2;
    public static String[] gcd() {

        String[] messageGame = new String[SIZE_ARRAY];
        int genValue1 = INITIAL_RANGE + (int) (Math.random() * END_RANGE + 1);
        int genValue2 = INITIAL_RANGE + (int) (Math.random() * END_RANGE + 1);

        messageGame[0] = "Question: " + genValue1 + " " + genValue2;
        while (genValue1 != 0 && genValue2 != 0) {
            if (genValue1 > genValue2) {
                genValue1 = genValue1 % genValue2;
            } else {
                genValue2 = genValue2 % genValue1;
            }
        }
        String correctAnswer = Integer.toString(genValue1 + genValue2);
        messageGame[1] = correctAnswer;
        return messageGame;
    }
}
