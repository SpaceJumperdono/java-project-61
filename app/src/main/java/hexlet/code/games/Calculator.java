package hexlet.code.games;

public class Calculator implements Game {
    public final int NUMBER_OPERATION = 3;
    public final int INITIAL_RANGE = 1;
    public final int END_RANGE = 100;
    public final int SIZE_ARRAY = 2;

    public String getTask() {
        return "What is the result of the expression?";
    }
    public String[] getDataPair() {
        String[] messageGame = new String[SIZE_ARRAY];
        int genOperation = 1 + (int) (Math.random() * NUMBER_OPERATION + 1);
        int genValue1 = INITIAL_RANGE + (int) (Math.random() * END_RANGE + 1);
        int genValue2 = INITIAL_RANGE + (int) (Math.random() * END_RANGE + 1);
        int result = 0;
        String question = "";
        switch (genOperation) {
            case 1:
                result = genValue1 + genValue2;
                question = genValue1 + " + " + genValue2;
                break;
            case 2:
                result = genValue1 - genValue2;
                question = genValue1 + " - " + genValue2;
                break;
            default:
                result = genValue1 * genValue2;
                question = genValue1 + " * " + genValue2;
                break;

        }
        messageGame[0] = question;
        messageGame[1] = Integer.toString(result);
        return messageGame;
    }
}
