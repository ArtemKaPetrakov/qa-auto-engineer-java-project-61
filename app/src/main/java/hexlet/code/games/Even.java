package hexlet.code.games;

import java.util.Scanner;
import hexlet.code.Engine;

public class Even {

    public static int generateRandomNumber() { // Рандомное число от 1 до 10
        return (int) (Math.random() * 10) + 1;
    }

    public static void evenGame() {

        String[][] questionsAndAnswers = new String[Engine.gameRounds][2];

        for (int i = 0; i < Engine.gameRounds; i++) {
            int question = generateRandomNumber();
            String correctAnswer = question % 2 == 0 ? "yes" : "no";
            questionsAndAnswers[i][0] = Integer.toString(question);
            questionsAndAnswers[i][1] = correctAnswer;
        }
        String gameRules = "Answer 'yes' if the number is even, otherwise answer 'no'.";

        Engine.runGame(gameRules, questionsAndAnswers);
    }
}