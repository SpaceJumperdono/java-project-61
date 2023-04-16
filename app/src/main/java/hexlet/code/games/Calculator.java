package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Scanner;

public class Calculator {
    public static void calc(Scanner scanner, String userName) {
        final int numberOperation = 3;
        final int initialRange = 1;
        final int endRange = 100;
        for (int i = 0; i < 3; i++) {
            int genOperation = 1 + (int) (Math.random() * numberOperation + 1);
            int genValue1 = initialRange + (int) (Math.random() * endRange + 1);
            int genValue2 = initialRange + (int) (Math.random() * endRange + 1);
            int result = 0;
            switch (genOperation) {
                case 1:
                    result = genValue1 + genValue2;
                    System.out.println("Question: " + genValue1 + " + " + genValue2);
                    break;
                case 2:
                    result = genValue1 - genValue2;
                    System.out.println("Question: " + genValue1 + " - " + genValue2);
                    break;
                default:
                    result = genValue1 * genValue2;
                    System.out.println("Question: " + genValue1 + " * " + genValue2);
                    break;
            }
            System.out.print("Your answer: ");
            String userAnswer = scanner.next();
            String correctAnswer = Integer.toString(result);
            if (!userAnswer.equals(correctAnswer)) {
                Engine.errorAnswer(correctAnswer, userAnswer, userName);
            }
            System.out.println("Correct!");
        }
        System.out.println("Congratulations, " + userName + "!");
    }
}
