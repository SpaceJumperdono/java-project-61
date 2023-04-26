package hexlet.code;


import java.util.Scanner;

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
                Greeting.greetings(scanner);
                break;

            case EVEN:
                Engine.evenStart(scanner);
                break;

            case CALC:
                Engine.calculatorStart(scanner);
                break;

            case GCD:
                Engine.gdcStart(scanner);
                break;

            case PROGRESSION:
                Engine.progressionStart(scanner);
                break;

            case PRIME:
                Engine.primeStart(scanner);
                break;

            default:
                break;
        }
    }
}
