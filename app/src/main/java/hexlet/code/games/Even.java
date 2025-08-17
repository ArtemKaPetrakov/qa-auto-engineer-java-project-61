package hexlet.code.games;

import java.util.Scanner;
import hexlet.code.Engine;
import hexlet.code.GetRandom;

public class Even {


    public static void evenGame() {

        int randomMax = 10;

        String[][] questionsAndAnswers = new String[Engine.gameRounds][2];

        for (int i = 0; i < Engine.gameRounds; i++) {
            int question = GetRandom.generateRandomNumber(randomMax);
            String correctAnswer = question % 2 == 0 ? "yes" : "no";
            questionsAndAnswers[i][0] = Integer.toString(question);
            questionsAndAnswers[i][1] = correctAnswer;
        }
        String gameRules = "Answer 'yes' if the number is even, otherwise answer 'no'.";

        Engine.runGame(gameRules, questionsAndAnswers);
    }
}