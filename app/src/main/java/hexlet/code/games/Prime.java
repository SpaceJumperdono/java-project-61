/**
 * The class implements the prime number game
 * @author Pavel Mikheev
 */

package hexlet.code.games;

public class Prime implements Game {
    public static final int INITIAL_RANGE = 1;
    public static final int END_RANGE = 100;
    public static final int ROUNDS = 3;
    public static final int SIZE_ARRAY = 2;

    /**
     * This method returns a string with the task
     * @author Pavel Mikheev
     */

    public String getTask() {
        return "Answer 'yes' if given number is prime. Otherwise answer 'no'.?";
    }

    /**
     * This method returns a question-answer pair for the Prime game
     * @author Pavel Mikheev
     */

    public String[] getDataPair() {
        String[] messageGame = new String[SIZE_ARRAY];
        int genValue = INITIAL_RANGE + (int) (Math.random() * END_RANGE + 1);
        messageGame[0] = Integer.toString(genValue);
        boolean flagPrime = checkPrime(genValue);
        messageGame[1] = flagPrime ? "yes" : "no";
        return messageGame;
    }

    /**
     * the method is designed to test for a prime number
     * @author Pavel Mikheev
     */

    public boolean checkPrime(int genValue) {
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
