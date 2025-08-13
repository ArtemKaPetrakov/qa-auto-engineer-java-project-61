package hexlet.code;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("0 - Exit");
        System.out.print("Your choice: ");
        String userAnswer = scanner.next();
//        scanner.close();

        switch (userAnswer) {
            case ("1"):
                Cli.greeting();
                break;
            case ("0"):
                break;
            default:
                System.out.println("Ой, кажется все сломалось!");
                break;
        }

//        Cli.greeting();

    }
}
