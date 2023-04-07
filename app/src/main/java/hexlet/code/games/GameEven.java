package hexlet.code.games;

import java.util.Scanner;

public class GameEven {
    public static int even(Scanner scanner, String userName) {
        final int INITIAL_RANGE = 1;
        final int END_RANGE = 100;
        int genValue = INITIAL_RANGE + (int) (Math.random() * END_RANGE + 1);
        System.out.println("Question: " + genValue);
        System.out.print("Your answer: ");
        String userAnswer = scanner.next().toLowerCase();
        if (genValue % 2 == 0 && userAnswer.equals("yes")) {
            System.out.println("Correct!");
        } else if (genValue % 2 != 0 && userAnswer.equals("no")) {
            System.out.println("Correct!");
        } else {
            String correctAnswer = userAnswer.equals("yes") ? "no" : "yes";
            System.out.print("'" + userAnswer + "'" + " is wrong answer ;(. Correct answer was '");
            System.out.println(correctAnswer + "'.");
            return 1;
        }
        return 0;
    }
}
