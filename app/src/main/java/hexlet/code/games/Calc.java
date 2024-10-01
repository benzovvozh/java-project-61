package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;


public class Calc {

    private static String operator;

    private static int result(int number1, int number2, int step) {
        if (step == 0) {
            operator = " + ";
            return number1 + number2;
        } else if (step == 1) {
            operator = " - ";
            return number1 - number2;
        } else if (step == 2) {
            operator = " * ";
            return number1 * number2;
        } else {
            return 0;
        }
    }

    public static void calcGame() {

        System.out.println("What is the result of the expression?");
        // создаем массив вопросов
        String[] questions = new String[Engine.getMaxRound()];
        // массив ответов
        String[] answers = new String[Engine.getMaxRound()];
        int x = 0;
        while (x < Engine.getMaxRound()) {
            // создаем 2 случайных числа
            int randomNumber = Utils.getRandomInt(0, Engine.getMaxRandomNumber());
            int randomNumber2 = Utils.getRandomInt(0, Engine.getMaxRandomNumber());
            // записываем вопросы и правильные ответы в массивы
            answers[x] = String.valueOf(result(randomNumber, randomNumber2, x));
            questions[x] = randomNumber + operator + randomNumber2;
            x++;
        }

        Engine.theGame(questions, answers);

    }

}
