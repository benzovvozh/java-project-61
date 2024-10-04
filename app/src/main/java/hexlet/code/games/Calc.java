package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;


public class Calc {
    private static final int MAXRANDOMNUMBER = 100;
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
            return (Integer) null;
        }
    }

    public static void calcGame() {

        System.out.println("What is the result of the expression?");
        String[][] questAndAns = new String[Engine.MAXROUND][2];
        int x = 0;
        while (x < Engine.MAXROUND) {
            // создаем 2 случайных числа
            int randomNumber = Utils.getRandomInt(0, MAXRANDOMNUMBER);
            int randomNumber2 = Utils.getRandomInt(0, MAXRANDOMNUMBER);
            // записываем вопросы и правильные ответы в массивы
            questAndAns[x][0] = randomNumber + operator + randomNumber2;
            questAndAns[x][1] = String.valueOf(result(randomNumber, randomNumber2, x));

            x++;
        }


        Engine.theGame(questAndAns);

    }

}
