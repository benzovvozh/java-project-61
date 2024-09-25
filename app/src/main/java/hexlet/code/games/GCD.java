package hexlet.code.games;

import hexlet.code.Cli;
import hexlet.code.Engine;

import java.util.Random;
import java.util.Scanner;

public class GCD {
    public static int gcdNumber = 0;

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
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Find the greatest common divisor of given numbers.");
        while (Engine.getCorrectAnswerValue() < Engine.getMaxRound()) {
            int randomNumber = random.nextInt(Engine.getMaxRandomNumber()) + 1;
            int randomNumber2 = random.nextInt(Engine.getMaxRandomNumber()) + 1;
            gcdNumber = findGCD(randomNumber, randomNumber2);
            if (Engine.getCorrectAnswerValue() == 0) {
                Engine.setCorrectAnswer(String.valueOf(gcdNumber));
                System.out.println("Question: " + randomNumber + " " + randomNumber2);
            } else if (Engine.getCorrectAnswerValue() == 1) {
                Engine.setCorrectAnswer(String.valueOf(gcdNumber));
                System.out.println("Question: " + randomNumber + " " + randomNumber2);
            } else if (Engine.getCorrectAnswerValue() == 2) {
                Engine.setCorrectAnswer(String.valueOf(gcdNumber));
                System.out.println("Question: " + randomNumber + " " + randomNumber2);
            }
            System.out.print("Your answer: ");
            Engine.setUserAnswer(scanner.next());
            Engine.answerCheck();
        }
        if (Engine.getCorrectAnswerValue() == Engine.getMaxRound()) {
            System.out.println("Congratulations, " + Cli.getUserName() + "!");
        }
    }
}


