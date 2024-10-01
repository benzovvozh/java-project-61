package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;


public class GCD {


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
        String[] questions = new String[Engine.getMaxRound()];
        String[] answers = new String[Engine.getMaxRound()];
        for (int i = 0; i < Engine.getMaxRound(); i++) {
            int randomNumber = Utils.getRandomInt(0, Engine.getMaxRandomNumber());
            int randomNumber2 = Utils.getRandomInt(0, Engine.getMaxRandomNumber());
            questions[i] = randomNumber + " " + randomNumber2;
            answers[i] = String.valueOf(findGCD(randomNumber, randomNumber2));
        }
        Engine.theGame(questions, answers);
    }
}


