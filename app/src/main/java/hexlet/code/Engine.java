package hexlet.code;

import hexlet.code.games.Calculator;
import hexlet.code.games.Even;
import hexlet.code.games.Gcd;
import hexlet.code.games.Prime;
import hexlet.code.games.Progression;

import java.util.Scanner;

public class Engine {
    public static final int ROUNDS = 3;

    public static void calculatorStart(Scanner scanner) {
        String userName = Greeting.greetings(scanner);
        System.out.println("What is the result of the expression?");
        for (int i = 0; i < ROUNDS; i++) {
            String[] messageGame = Calculator.calc();
            System.out.println(messageGame[0]);
            System.out.print("Your answer: ");
            String userAnswer = scanner.next();
            if (!userAnswer.equals(messageGame[1])) {
                Engine.errorAnswer(messageGame[1], userAnswer, userName);
                return;
            }
            System.out.println("Correct!");
        }
        System.out.println("Congratulations, " + userName + "!");
    }

    public static void evenStart(Scanner scanner) {
        String userName = Greeting.greetings(scanner);
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        for (int i = 0; i < ROUNDS; i++) {
            String[] messageGame = Even.even();
            System.out.println(messageGame[0]);
            System.out.print("Your answer: ");
            String userAnswer = scanner.next();
            if (!userAnswer.equals(messageGame[1])) {
                Engine.errorAnswer(messageGame[1], userAnswer, userName);
                return;
            }
            System.out.println("Correct!");
        }
        System.out.println("Congratulations, " + userName + "!");
    }

    public static void gdcStart(Scanner scanner) {
        String userName = Greeting.greetings(scanner);
        System.out.println("Find the greatest common divisor of given numbers.");
        for (int i = 0; i < ROUNDS; i++) {
            String[] messageGame = Gcd.gcd();
            System.out.println(messageGame[0]);
            System.out.print("Your answer: ");
            String userAnswer = scanner.next();
            if (!userAnswer.equals(messageGame[1])) {
                Engine.errorAnswer(messageGame[1], userAnswer, userName);
                return;
            }
            System.out.println("Correct!");
        }
        System.out.println("Congratulations, " + userName + "!");
    }

    public static void progressionStart(Scanner scanner) {
        String userName = Greeting.greetings(scanner);
        System.out.println("What number is missing in the progression?");
        for (int i = 0; i < ROUNDS; i++) {
            String[] messageGame = Progression.progression();
            System.out.println(messageGame[0]);
            System.out.print("Your answer: ");
            String userAnswer = scanner.next();
            if (!userAnswer.equals(messageGame[1])) {
                Engine.errorAnswer(messageGame[1], userAnswer, userName);
                return;
            }
            System.out.println("Correct!");
        }
        System.out.println("Congratulations, " + userName + "!");
    }

    public static void primeStart(Scanner scanner) {
        String userName = Greeting.greetings(scanner);
        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.?");
        for (int i = 0; i < ROUNDS; i++) {
            String[] messageGame = Prime.prime();
            System.out.println(messageGame[0]);
            System.out.print("Your answer: ");
            String userAnswer = scanner.next();
            if (!userAnswer.equals(messageGame[1])) {
                Engine.errorAnswer(messageGame[1], userAnswer, userName);
                return;
            }
            System.out.println("Correct!");
        }
        System.out.println("Congratulations, " + userName + "!");
    }
    public static void errorAnswer(String correctAnswer, String userAnswer, String userName) {
        System.out.print("'" + userAnswer + "'" + " is wrong answer ;(. Correct answer was '");
        System.out.println(correctAnswer + "'.");
        System.out.println("Let's try again, " + userName + "!");
    }

    public static String correctAnswer(boolean expression) {
        return expression ? "yes" : "no";
    }

}
