package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;


public class GCD {
    private static final int MAXRANDOMNUMBER = 100;


    private static int findGCD(int a, int b) {
        while (b != 0) {
            // Найдём остаток от деления
            int remainder = a % b;
            // Заменим a на b, а b на остаток
            a = b;
            b = remainder;
        }
        // Когда b стало 0, a - это НОД
        return a;
    }


    public static void gcdGame() {


        System.out.println("Find the greatest common divisor of given numbers.");

        String[][] questAndAns = new String[Engine.MAXROUND][2];
        for (int i = 0; i < Engine.MAXROUND; i++) {
            int randomNumber1 = Utils.getRandomInt(0, MAXRANDOMNUMBER);
            int randomNumber2 = Utils.getRandomInt(0, MAXRANDOMNUMBER);
            questAndAns[i][0] = randomNumber1 + " " + randomNumber2;
            questAndAns[i][1] = String.valueOf(findGCD(randomNumber1, randomNumber2));
        }
        Engine.theGame(questAndAns);
    }
}


