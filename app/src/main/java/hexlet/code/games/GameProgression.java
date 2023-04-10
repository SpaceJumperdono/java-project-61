package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Scanner;

public class GameProgression {
    public static void progressoion(Scanner scanner, String userName) {
        final int initialRange = 1;
        final int endRangeMas = 100;
        final int endRangeStep = 15;
        int[] mas = new int[10];
        for (int i = 0; i < 3; i++) {
            int startValue = initialRange + (int) (Math.random() * endRangeMas + 1);
            int genStep = initialRange + (int) (Math.random() * endRangeStep + 1);
            int randomValue = (int) (Math.random() * mas.length);
            mas[0] = startValue;
            for (int j = 1; j < mas.length; j++) {
                mas[j] = mas[j - 1] + genStep;
            }
            System.out.print("Question: ");
            for (int j = 0; j < mas.length; j++) {
                if (j == randomValue) {
                    System.out.print(".. ");
                    continue;
                }
                System.out.print(mas[j] + " ");
            }
            System.out.print("\nYour answer: ");
            String userAnswer = scanner.next();
            String correctAnswer = Integer.toString(mas[randomValue]);
            if (!userAnswer.equals(correctAnswer)) {
                Engine.errorAnswer(correctAnswer, userAnswer, userName);
                return;
            }
            System.out.println("Correct!");
        }
        System.out.println("Congratulations, " + userName + "!");
    }
}
