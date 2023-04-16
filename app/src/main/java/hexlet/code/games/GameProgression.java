package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Scanner;

public class GameProgression {
    public static void progression(Scanner scanner, String userName) {
        final int initialRange = 1;
        final int endRangeMas = 100;
        final int endRangeStep = 15;
        final int arraySize = 10;
        int[] array = new int[arraySize];
        final int rounds = 3;
        for (int i = 0; i < rounds; i++) {
            int startValue = initialRange + (int) (Math.random() * endRangeMas + 1);
            int genStep = initialRange + (int) (Math.random() * endRangeStep + 1);
            int randomValue = (int) (Math.random() * array.length);
            array[0] = startValue;
            for (int j = 1; j < array.length; j++) {
                array[j] = array[j - 1] + genStep;
            }
            System.out.print("Question: ");
            GameProgression.printArrayWithSecretValue(array, randomValue);
            System.out.print("\nYour answer: ");
            String userAnswer = scanner.next();
            String correctAnswer = Integer.toString(array[randomValue]);
            if (!userAnswer.equals(correctAnswer)) {
                Engine.errorAnswer(correctAnswer, userAnswer, userName);
                return;
            }
            System.out.println("Correct!");
        }
        System.out.println("Congratulations, " + userName + "!");
    }

    public static void printArrayWithSecretValue(int[] array, int randomValue) {
        for (int j = 0; j < array.length; j++) {
            if (j == randomValue) {
                System.out.print(".. ");
                continue;
            }
            System.out.print(array[j] + " ");
        }
    }
}
