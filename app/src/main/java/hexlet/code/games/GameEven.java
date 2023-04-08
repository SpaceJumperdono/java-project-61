package hexlet.code.games;

import java.util.Scanner;

public class GameEven {
    public static int even(Scanner scanner, String userName) {
        final int initialRange = 1;
        final int endRange = 100;
        int genValue = initialRange + (int) (Math.random() * endRange + 1);
        System.out.println("Question: " + genValue);
        System.out.print("Your answer: ");
        String userAnswer = scanner.next().toLowerCase();
        if (genValue % 2 == 0 && userAnswer.equals("no") || genValue % 2 != 0 && userAnswer.equals("yes")) {
            String correctAnswer = userAnswer.equals("yes") ? "no" : "yes";
            System.out.print("'" + userAnswer + "'" + " is wrong answer ;(. Correct answer was '");
            System.out.println(correctAnswer + "'.");
            return 1;
        }
        return 0;
    }
}
