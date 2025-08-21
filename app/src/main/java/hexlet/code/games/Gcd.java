package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.GetRandom;

public class Gcd {

    public static int getDivider (int num1, int num2) {
        int temp;

        if (num1 == 0) {
            return num2;
        }
        if (num2 == 0) {
            return num1;
        }
        while (num2 != 0) {
            temp = num1 % num2;
            num1 = num2;
            num2 = temp;
        }
        return num1;
    }

    public static void gcdGame() {

        String gameRules = "Find the greatest common divisor of given numbers.";

        int randomMax = 100;

        String[][] questionsAndAnswers = new String[Engine.GAME_ROUNDS][2];

        for (int i = 0; i < Engine.GAME_ROUNDS; i++) {
            int randomNumber1 = GetRandom.generateRandomNumber(randomMax);
            int randomNumber2 = GetRandom.generateRandomNumber(randomMax);
            String question = Integer.toString(randomNumber1) + " " + Integer.toString(randomNumber2);

            int correctAnswer = getDivider(randomNumber1, randomNumber2);

            questionsAndAnswers[i][0] = question;
            questionsAndAnswers[i][1] = Integer.toString(correctAnswer);

          }
         Engine.runGame(gameRules, questionsAndAnswers);
        }
    }
