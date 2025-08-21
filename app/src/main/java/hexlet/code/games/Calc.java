package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.GetRandom;

public class Calc {

    public static String generateRandomArithmeticOperations() {
        String[] arithmeticOperations = {"*", "-", "+"}; // Рандомное число от 1 до 10
        int randomIndex = GetRandom.generateRandomNumber(arithmeticOperations.length - 1);
        return arithmeticOperations[randomIndex];
    }

    public static void calcGame() {

        int randomMax = 10;

        String gameRules = "What is the result of the expression?";
        String[][] questionsAndAnswers = new String[Engine.GAME_ROUNDS][2];

        for (int i = 0; i < Engine.GAME_ROUNDS; i++) {

            int randomNumber1 = GetRandom.generateRandomNumber(randomMax);
            int randomNumber2 = GetRandom.generateRandomNumber(randomMax);
            String randomArithmetic = generateRandomArithmeticOperations();
            String question = Integer.toString(randomNumber1)
                    + " " + randomArithmetic
                    + " " + Integer.toString(randomNumber2);

            int correctAnswer;

            switch (randomArithmetic) {
                case "+":
                    correctAnswer = randomNumber1 + randomNumber2;
                    break;
                case "-":
                    correctAnswer = randomNumber1 - randomNumber2;
                    break;
                case "*":
                    correctAnswer = randomNumber1 * randomNumber2;
                    break;
                default:
                    throw new IllegalStateException("Не знаю что за оператор: " + randomArithmetic);
            }

            questionsAndAnswers[i][0] = question;
            questionsAndAnswers[i][1] = Integer.toString(correctAnswer);

        }
        Engine.runGame(gameRules, questionsAndAnswers);
    }
}
