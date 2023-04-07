package hexlet.code;

import hexlet.code.games.Calculator;
import hexlet.code.games.GameEven;

import java.util.Scanner;

public class Engine {
    public static void start() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet\n2 - Even\n3 - Calc\n0 - Exit\n");
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
                break;
            case 3:
                userName = Greeting.greetings(scanner);
                System.out.println("What is the result of the expression?");
                break;
            default:
                scanner.close();
                return;
        }
        for (int i = 0; i < 3; i++) {
            if (userChoice == 2) {
                if (GameEven.even(scanner, userName) == 1) {
                    System.out.println("Let's try again " + userName);
                    scanner.close();
                    return;
                }
            }
            if (userChoice == 3) {
                if (Calculator.calc(scanner) == 1) {
                    System.out.println("Let's try again " + userName);
                    scanner.close();
                    return;
                }
            }
        }
        System.out.println("Congratulations, " + userName + "!");
        scanner.close();
    }
}
