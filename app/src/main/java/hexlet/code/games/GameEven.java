package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Scanner;

public class GameEven {
    public static void even(Scanner scanner, String userName) {
        final int initialRange = 1;
        final int endRange = 100;
        for (int i = 0; i < 3; i++) {
            int genValue = initialRange + (int) (Math.random() * endRange + 1);
            System.out.println("Question: " + genValue);
            System.out.print("Your answer: ");
            String userAnswer = scanner.next().toLowerCase();
            if (genValue % 2 == 0 && userAnswer.equals("no") || genValue % 2 != 0 && userAnswer.equals("yes")) {
                String correctAnswer = userAnswer.equals("yes") ? "no" : "yes";
                Engine.errorAnswer(correctAnswer, userAnswer, userName);
                return;
            }
            System.out.println("Correct!");
        }
        System.out.println("Congratulations, " + userName + "!");
    }
}
