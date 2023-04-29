/**
 * The class implements the prime number game.
 * @author Pavel Mikheev
 */

package hexlet.code.games;

public class Prime implements Game {
    public static final int ROUNDS = 3;
    public static final int SIZE_ARRAY = 2;

    /**
     * This method returns a string with the task.
     * @author Pavel Mikheev
     * @return string with the task
     */

    public String getTask() {
        return "Answer 'yes' if given number is prime. Otherwise answer 'no'.?";
    }

    /**
     * This method returns a question-answer pair for the Prime game.
     * @author Pavel Mikheev
     * @return question-answer pair
     */

    public String[] getDataPair() {
        String[] messageGame = new String[SIZE_ARRAY];
        int genValue = Utils.generateValueWithRange();
        messageGame[0] = Integer.toString(genValue);
        messageGame[1] = checkPrime(genValue) ? "yes" : "no";
        return messageGame;
    }

    /**
     * the method is designed to test for a prime number.
     * @author Pavel Mikheev
     * @return flag of prime number
     * @param genValue - check value for prime
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
