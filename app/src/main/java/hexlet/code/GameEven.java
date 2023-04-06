package hexlet.code;

import java.util.Scanner;

public class GameEven {
    public static void even(Scanner scanner) {
        String userName = Greeting.greetings(scanner);
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        int gameCycle = 3;
        int initialRange = 1;
        int endRange = 100;
        int score = 0;
        for (int i = 0; i < gameCycle; i++) {
            int genValue = initialRange + (int) (Math.random() * endRange + 1);
            System.out.println("Question: " + genValue);
            System.out.print("Your answer: ");
            String userAnswer = scanner.next().toLowerCase();
            if (genValue % 2 == 0 && userAnswer.equals("yes")) {
                System.out.println("Correct!");
            } else if (genValue % 2 != 0 && userAnswer.equals("no")) {
                System.out.println("Correct!");
            } else {
                String correctAnswer = userAnswer.equals("yes") ? "no" : "yes";
                System.out.println("'" + userAnswer + "'" + " is wrong answer ;(. Correct answer was '" + correctAnswer + "'.)\nLet's try again,"  + userName);
                return;
            }
        }
        System.out.println("Congratulations, " + userName + "!");
    }
}
