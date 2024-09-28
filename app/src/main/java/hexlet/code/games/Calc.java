package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;


public class Calc {


    public static int result(int number1, int number2, int step) {
        if (step == 0) {
            return number1 + number2;
        } else if (step == 1) {
            return number1 - number2;
        } else {
            return number1 * number2;
        }
    }

    public static void calcGame() {

        Random random = new Random();
        System.out.println("What is the result of the expression?");


        // создаем массив вопросов
        String[] questions = new String[Engine.getMaxRound()];
        // массив ответов
        String[] answers = new String[Engine.getMaxRound()];
        int x = 0;
        while (x < Engine.getMaxRound()) {

            // создаем 2 случайных числа
            int randomNumber = random.nextInt(Engine.getMaxRandomNumber()) + 1;
            int randomNumber2 = random.nextInt(Engine.getMaxRandomNumber()) + 1;

            // записываем вопросы в массив вопросов и записываем правильные ответы
            if (x == 0) {
                answers[0] = String.valueOf(result(randomNumber, randomNumber2, x));
                questions[0] = randomNumber + " + " + randomNumber2;
            } else if (x == 1) {
                answers[1] = String.valueOf(result(randomNumber, randomNumber2, x));
                questions[1] = randomNumber + " - " + randomNumber2;
            } else if (x == 2) {
                answers[2] = String.valueOf(result(randomNumber, randomNumber2, x));
                questions[2] = randomNumber + " * " + randomNumber2;
            }
            x++;
        }
        Engine.theGame(questions, answers);

    }

}
