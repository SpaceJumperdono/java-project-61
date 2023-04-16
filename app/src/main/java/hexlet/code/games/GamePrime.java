package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Scanner;

public class GamePrime {
    public static void prime(Scanner scanner, String userName) {
        final int initialRange = 1;
        final int endRange = 100;
        for (int i = 0; i < 3; i++) {
            int genValue = initialRange + (int) (Math.random() * endRange + 1);
            System.out.println("Question: " + genValue);
            System.out.print("Your answer: ");
            String userAnswer = scanner.next();
            boolean flagPrime = GamePrime.checkPrime(genValue);
            if ((!flagPrime && userAnswer.equals("yes")) || (flagPrime && userAnswer.equals("no"))) {
                String correctAnswer = userAnswer.equals("yes") ? "no" : "yes";
                Engine.errorAnswer(correctAnswer, userAnswer, userName);
                return;
            }
            System.out.println("Correct!");
        }
        System.out.println("Congratulations, " + userName + "!");
    }

    public static boolean checkPrime(int genValue) {
        boolean flagPrime = true;
        if (genValue == 1) {
            flagPrime = false;
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
