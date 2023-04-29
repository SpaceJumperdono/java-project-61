package hexlet.code;

import java.util.Scanner;
import hexlet.code.games.Even;
import hexlet.code.games.Calculator;
import hexlet.code.games.Gcd;
import hexlet.code.games.Prime;
import hexlet.code.games.Progression;
public class App {

    public static final int GREET = 1;
    public static final int EVEN = 2;
    public static final int CALC = 3;
    public static final int GCD = 4;
    public static final int PROGRESSION = 5;
    public static final int PRIME = 6;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("3 - Calc");
        System.out.println("4 - GCD");
        System.out.println("5 - Progression");
        System.out.println("6 - Prime");
        System.out.println("0 - Exit");

        System.out.print("Your choice: ");
        int userChoice = Integer.parseInt(scanner.nextLine());
        Engine engine = new Engine();
        switch (userChoice) {
            case GREET:
                Cli.greetings();
                break;

            case EVEN:
                engine.start(new Even());
                break;

            case CALC:
                engine.start(new Calculator());
                break;

            case GCD:
                engine.start(new Gcd());
                break;

            case PROGRESSION:
                engine.start(new Progression());
                break;

            case PRIME:
                engine.start(new Prime());
                break;

            default:
                break;
        }
    }
}
