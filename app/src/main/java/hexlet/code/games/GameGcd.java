package hexlet.code.games;

import java.util.Scanner;

public class GameGcd {
    public static int gcd(Scanner scanner) {
        final int initialRange = 1;
        final int endRange = 100;
        int genValue1 = initialRange + (int) (Math.random() * endRange + 1);
        int genValue2 = initialRange + (int) (Math.random() * endRange + 1);

        System.out.println("Question: " + genValue1 + " " + genValue2);
        System.out.print("Your answer: ");
        int userAnswer = Integer.parseInt(scanner.next());

        int correctAnswer = 0;
        while (genValue1 != 0 && genValue2 != 0) {
            if (genValue1 > genValue2) {
                genValue1 = genValue1 % genValue2;
            } else {
                genValue2 = genValue2 % genValue1;
            }
        }
        correctAnswer = genValue1 + genValue2;
        if (userAnswer != correctAnswer) {
            System.out.print("'" + userAnswer + "' is wrong answer ;(. ");
            System.out.println("Correct answer was '" + correctAnswer + "'.");
            return 1;
        }
        return 0;
    }
}
