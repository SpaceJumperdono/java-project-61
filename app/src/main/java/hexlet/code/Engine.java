package hexlet.code;

import hexlet.code.games.Calculator;
import hexlet.code.games.GameEven;
import hexlet.code.games.GameGcd;
import hexlet.code.games.GameProgression;

import java.util.Scanner;

public class Engine {
    public static void start() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet\n2 - Even\n3 - Calc\n4 - GCD\n5 - Progression\n0 - Exit\n");
        System.out.print("Your choice: ");
        int userChoice = Integer.parseInt(scanner.nextLine());
        String userName = "";
        switch (userChoice) {
            case 1:
                Greeting.greetings(scanner);
                scanner.close();
                return;
            case 2:
                userName = Greeting.greetings(scanner);
                System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
                GameEven.even(scanner, userName);
                break;
            case 3:
                userName = Greeting.greetings(scanner);
                System.out.println("What is the result of the expression?");
                Calculator.calc(scanner, userName);
                break;
            case 4:
                userName = Greeting.greetings(scanner);
                System.out.println("Find the greatest common divisor of given numbers.");
                GameGcd.gcd(scanner, userName);
                break;
            case 5:
                userName = Greeting.greetings(scanner);
                System.out.println("What number is missing in the progression?");
                GameProgression.progressoion(scanner, userName);
            default:
                scanner.close();
                return;
        }
        scanner.close();
    }

    public static void errorAnswer(String correctAnswer, String userAnswer, String userName) {
        System.out.print("'" + userAnswer + "'" + " is wrong answer ;(. Correct answer was '");
        System.out.println(correctAnswer + "'.");
        System.out.println("Let's try again, " + userName);
    }
}
