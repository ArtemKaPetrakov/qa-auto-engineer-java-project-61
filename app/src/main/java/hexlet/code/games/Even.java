package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.GetRandom;

public class Even {

    private static final int MAX_RANDOM_NUMBER = 10;

    public static void evenGame() {

        String[][] questionsAndAnswers = new String[Engine.GAME_ROUNDS][2];

        for (int i = 0; i < Engine.GAME_ROUNDS; i++) {
            int question = GetRandom.generateRandomNumber(MAX_RANDOM_NUMBER);
            String correctAnswer = question % 2 == 0 ? "yes" : "no";
            questionsAndAnswers[i][0] = Integer.toString(question);
            questionsAndAnswers[i][1] = correctAnswer;
        }
        String gameRules = "Answer 'yes' if the number is even, otherwise answer 'no'.";

        Engine.runGame(gameRules, questionsAndAnswers);
    }
}
