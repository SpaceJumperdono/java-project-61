/**
 * The class is designed to control games.
 * @author Pavel Mikheev
 */

package hexlet.code;

import hexlet.code.games.Game;

import java.util.Scanner;

public class Engine {
    public static final int ROUNDS = 3;
    public static final int QUESTION = 0;
    public static final int ANSWER = 1;

    /**
     * this method launches games and handles input/output.
     * @author Pavel Mikheev
     * @param game - object of class Game
     */
    public static void start(Game game) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        String name = scanner.nextLine();
        System.out.println("Hello, " + name + "!");
        String task = game.getTask();
        System.out.println(task);
        for (int i = 0; i < ROUNDS; i++) {
            String[] dataGame = game.getDataPair();
            System.out.println("Question: " + dataGame[QUESTION]);
            System.out.print("Your answer: ");
            String userAnswer = scanner.next();
            if (!userAnswer.equals(dataGame[ANSWER])) {
                System.out.print("'" + userAnswer + "'" + " is wrong answer ;(. Correct answer was '");
                System.out.println(dataGame[ANSWER] + "'.");
                System.out.println("Let's try again, " + name + "!");
                return;
            }
            System.out.println("Correct!");
        }
        System.out.println("Congratulations, " + name + "!");
    }
}
