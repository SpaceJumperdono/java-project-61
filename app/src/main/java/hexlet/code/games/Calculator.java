package hexlet.code.games;

import java.util.Scanner;

public class Calculator {
    public static int calc(Scanner scanner) {
        final int numberOperation = 3;
        final int initialRange = 1;
        final int endRange = 100;
        int genOperation = 1 + (int) (Math.random() * numberOperation + 1);
        int genValue1 = initialRange + (int) (Math.random() * endRange + 1);
        int genValue2 = initialRange + (int) (Math.random() * endRange + 1);
        int result = 0;
        switch (genOperation) {
            case 1:
                result = genValue1 + genValue2;
                System.out.println("Question: " + genValue1 + "+" + genValue2);
                break;
            case 2:
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
        if (result != userAnswer) {
            System.out.print("'" + userAnswer + "' is wrong answer ;(. ");
            System.out.println("Correct answer was '" + result + "'.");
            return 1;
        }
        return 0;
    }
}
