package hexlet.code;

import java.util.Scanner;
import hexlet.code.games.Even;
import hexlet.code.games.Calc;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("3 - Calc");
        System.out.println("0 - Exit");
        System.out.print("Your choice: ");
        String userAnswer = scanner.next();

        switch (userAnswer) {
            case ("1"):
                Cli.greeting();
                break;
            case ("2"):
                Even.evenGame();
                break;
            case ("3"):
                Calc.calcGame();
                break;
            case ("0"):
                break;
            default:
                System.out.println("Ой, кажется все сломалось!");
                break;
        }
    }
}
