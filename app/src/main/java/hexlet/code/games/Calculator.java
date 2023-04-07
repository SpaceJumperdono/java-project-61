package hexlet.code.games;

import java.util.Scanner;

public class Calculator {
    public static int calc(Scanner scanner) {
        final int NUMBEROPERATION = 3;
        final int INITIAL_RANGE = 1;
        final int END_RANGE = 100;
        int genOperation = 1 + (int) (Math.random() * NUMBEROPERATION + 1);
        int genValue1 = INITIAL_RANGE + (int) (Math.random() * END_RANGE + 1);
        int genValue2 = INITIAL_RANGE + (int) (Math.random() * END_RANGE + 1);
        int result = 0;
        switch (genOperation) {
            case 1:
                result = genValue1 + genValue2;
                System.out.println("Question: " + genValue1 + "+" + genValue2);
                break;
            case 2 :
                result = genValue1 - genValue2;
                System.out.println("Question: " + genValue1 + "-" + genValue2);
                break;
            default:
                result = genValue1 * genValue2;
                System.out.println("Question: " + genValue1 + "*" + genValue2);
                break;
        }
        System.out.print("Your answer: ");
        int userAnswer = Integer.parseInt(scanner.next());
        if (result == userAnswer) {
            System.out.println("Correct!");
            return 0;
        } else {
            System.out.print("'" + userAnswer + "' is wrong answer ;(. ");
            System.out.println("Correct answer was '" + result + "'.");
            return 1;
        }
    }
}
