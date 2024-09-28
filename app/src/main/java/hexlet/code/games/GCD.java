package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Random;


public class GCD {


    public static int findGCD(int a, int b) {
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

        Random random = new Random();
        System.out.println("Find the greatest common divisor of given numbers.");
        String[] questions = new String[Engine.getMaxRound()];
        String[] answers = new String[Engine.getMaxRound()];
        for (int i = 0; i < Engine.getMaxRound(); i++) {
            int randomNumber = random.nextInt(Engine.getMaxRandomNumber()) + 1;
            int randomNumber2 = random.nextInt(Engine.getMaxRandomNumber()) + 1;
            questions[i] = randomNumber + " " + randomNumber2;
            answers[i] = String.valueOf(findGCD(randomNumber, randomNumber2));
        }
        Engine.theGame(questions, answers);
    }
}


