package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Scanner;

public class GameGcd {
    public static void gcd(Scanner scanner, String userName) {
        final int initialRange = 1;
        final int endRange = 100;
        for (int i = 0; i < 3; i++) {
            int genValue1 = initialRange + (int) (Math.random() * endRange + 1);
            int genValue2 = initialRange + (int) (Math.random() * endRange + 1);

            System.out.println("Question: " + genValue1 + " " + genValue2);
            System.out.print("Your answer: ");
            String userAnswer = scanner.next();
            while (genValue1 != 0 && genValue2 != 0) {
                if (genValue1 > genValue2) {
                    genValue1 = genValue1 % genValue2;
                } else {
                    genValue2 = genValue2 % genValue1;
                }
            }
            String correctAnswer = Integer.toString(genValue1 + genValue2);
            if (!userAnswer.equals(correctAnswer)) {
                Engine.errorAnswer(correctAnswer, userAnswer, userName);
                return;
            }
            System.out.println("Correct!");
        }
        System.out.println("Congratulations, " + userName + "!");
    }
}
