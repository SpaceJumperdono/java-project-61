package hexlet.code.games;

import hexlet.code.Engine;


public class Prime {
    public static final int INITIAL_RANGE = 1;
    public static final int END_RANGE = 100;
    public static final int ROUNDS = 3;
    public static final int SIZE_ARRAY = 2;
    public static String[] prime() {
        String[] messageGame = new String[SIZE_ARRAY];
        int genValue = INITIAL_RANGE + (int) (Math.random() * END_RANGE + 1);
        messageGame[0] = "Question: " + genValue;
        boolean flagPrime = Prime.checkPrime(genValue);
        messageGame[1] = Engine.correctAnswer(flagPrime);
        return messageGame;
    }

    public static boolean checkPrime(int genValue) {
        boolean flagPrime = true;
        if (genValue == 1) {
            return false;
        }
        for (int j = 2; j * j <= genValue; j++) {
            if (genValue % j == 0) {
                flagPrime = false;
                break;
            }
        }
        return flagPrime;
    }

}
