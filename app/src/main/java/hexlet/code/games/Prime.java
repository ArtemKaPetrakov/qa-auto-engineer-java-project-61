package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.GetRandom;

public class Prime {

    public static boolean isPrime(int num) {
        if (num < 2) {
            return false;
        }
        if (num == 2) {
            return true;
        }
        if (num % 2 == 0) {
            return false;
        }
        for (int i = 3; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void primeGame() {

        String gameRules = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";

        private static final int MAX_RANDOM_NUMBER = 100;

        String[][] questionsAndAnswers = new String[Engine.GAME_ROUNDS][2];

        for (int i = 0; i < Engine.GAME_ROUNDS; i++) {
            int randomNum = GetRandom.generateRandomNumber(MAX_RANDOM_NUMBER);
            String answer = isPrime(randomNum) ? "yes" : "no";
            questionsAndAnswers[i][0] = Integer.toString(randomNum);
            questionsAndAnswers[i][1] = answer;
        }
        Engine.runGame(gameRules, questionsAndAnswers);
    }
}
