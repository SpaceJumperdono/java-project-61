package hexlet.code;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet\n2 - Even\n0 - Exit\n");
        System.out.print("Your choice: ");
        int userChoice = Integer.parseInt(scanner.nextLine());
        if (userChoice == 1) {
            Greeting.greetings(scanner);
        } else if (userChoice == 2) {
            GameEven.even(scanner);
        } else {
            return;
        }
        scanner.close();
    }
}
