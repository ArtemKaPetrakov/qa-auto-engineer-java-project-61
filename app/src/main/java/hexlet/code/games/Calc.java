package hexlet.code.games;

import java.util.Scanner;
import hexlet.code.Engine;

public class Calc {

    public static int generateRandomNumber() { // Рандомное число от 1 до 10
        return (int) (Math.random() * 100) + 1;
    }

    public static String generateRandomArithmeticOperations() {
        String[] arithmeticOperations = {"*", "-", "+"};// Рандомное число от 1 до 10
        int randomIndex = (int) (Math.random() * (arithmeticOperations.length - 1) + 1);
        return arithmeticOperations[randomIndex];
    }

    public static void calcGame() {

        String gameRules = "What is the result of the expression?";
        String[][] questionsAndAnswers = new String[Engine.gameRounds][2];

        for (int i = 0; i < Engine.gameRounds; i++) {

            int randomNumber1 = generateRandomNumber();
            int randomNumber2 = generateRandomNumber();
            String randomArithmetic = generateRandomArithmeticOperations();
            String question = Integer.toString(randomNumber1)
                    + " " + randomArithmetic
                    + " " + Integer.toString(randomNumber2);

            int correctAnswer;

            switch (randomArithmetic) { // !
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