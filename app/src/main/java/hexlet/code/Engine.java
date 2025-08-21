package hexlet.code;

import java.util.Scanner;

public class Engine {

    public static final int GAME_ROUNDS = 3;

    public static void runGame(String gameRules, String[][] quesionsAndAnswers) {

        Scanner scanner = new Scanner(System.in); // Приветствие пользователя

        System.out.println("Welcome to the Brain Games!");
        System.out.print("What is your name? ");
        String userName = scanner.next();
        System.out.println("Hello, " + userName + "!");
        System.out.println(gameRules);

        for (int i = 0; i < GAME_ROUNDS; i++) { // раунды с сравнение вопросов, ответов и ответов пользователя
            String question = quesionsAndAnswers[i][0];
            String correctAnswer = quesionsAndAnswers[i][1];

            System.out.println("Question: " + question);
            System.out.print("Your answer: ");
            String userAnswer = scanner.next().toLowerCase().trim();

            if (userAnswer.equals(correctAnswer)) {
                System.out.println("Correct!");
            } else {
                System.out.println("'" + userAnswer + "' is wrong answer ;(. "
                        + "Correct answer was '" + correctAnswer + "'");
                System.out.println("Let's try again! " + userName);
                scanner.close();
                return;
            }
        }
        scanner.close();
        System.out.println("Congratulations, " + userName + "!");
    }
}
