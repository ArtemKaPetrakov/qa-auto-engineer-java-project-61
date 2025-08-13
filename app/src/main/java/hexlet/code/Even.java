package hexlet.code;

import java.util.Scanner;

public class Even {

    public static int generateRandomNumber() { // Рандомное число от 1 до 10
        return (int) (Math.random() * 10) + 1;
    }

    public static void evenGame() {

        Scanner scanner = new Scanner(System.in);

        System.out.println();
        System.out.println("Welcome to the Brain Games!");
        System.out.print("What is your name? ");
        String userName = scanner.next();
        System.out.println("Hello, " + userName + "!");


        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");

        for (int i = 0; i < 3; i += 1) {
            int randomNumber = generateRandomNumber();
            String correctAnswer = randomNumber % 2 == 0 ? "yes" : "no";

            System.out.println("Question: " + randomNumber);
            System.out.print("Your answer: ");

            String userAnswer = scanner.next().toLowerCase().trim(); // ответ в нижнем регистре

            if (userAnswer.equals(correctAnswer)) {
                System.out.println("Correct!");
            } else {
                System.out.println("'" + userAnswer + "' is wrong answer ;(. Correct answer was '" + correctAnswer + "'");
                System.out.println("Let's try again! " + userName);
                scanner.close();
                return;
            }
        }
        scanner.close();
        System.out.println("Congratulations! " + userName);
    }
}