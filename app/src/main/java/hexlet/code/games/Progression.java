package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.GetRandom;

public class Progression {

    private static final int RANDOM_FIRST_NUM = 100;
    private static final int STEP = 10;
    private static final int ELEMENT = 9;
    private static final int PROGRESSION_SIZE = 10;

    public static String[] buildProgresion(int startNum, int step, int hiddenIndex, int size) {

        String[] progression = new String[size];
        int[] numbers = new int[size];

        numbers[0] = startNum;
        for (int i = 1; i < size; i++) {
            numbers[i] = numbers[i - 1] + step;
        }
        int correctAnswer = numbers[hiddenIndex];

        for (int i = 0; i < size; i++) {
            if (i == hiddenIndex) {
                progression[i] = "..";
            } else {
                progression[i] = Integer.toString(numbers[i]);
            }
        }

        String[] result = new String[2];
        result[0] = String.join(" ", progression);
        result[1] = Integer.toString(correctAnswer);

        return result;
    }


    public static void progressionGame() {

        String gameRules = "What number is missing in the progression?";

        String[][] questionsAndAnswers = new String[Engine.GAME_ROUNDS][2];

        for (int i = 0; i < Engine.GAME_ROUNDS; i++) {

            int randomStartNum = GetRandom.generateRandomNumber(RANDOM_FIRST_NUM);
            int randomStep = GetRandom.generateRandomNumber(STEP) + 1; // не может быть 0
            int randomHiddenIndex = GetRandom.generateRandomNumber(ELEMENT) - 1; // индекс от 0 до 9

            String[] result = buildProgresion(randomStartNum, randomStep, randomHiddenIndex, PROGRESSION_SIZE);

            questionsAndAnswers[i][0] = result[0];
            questionsAndAnswers[i][1] = result[1];
        }
        Engine.runGame(gameRules, questionsAndAnswers);
    }
}
