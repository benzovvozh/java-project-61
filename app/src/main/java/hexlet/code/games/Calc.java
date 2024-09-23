package hexlet.code.games;

import hexlet.code.Cli;
import hexlet.code.Engine;

import java.util.Random;
import java.util.Scanner;


public class Calc {
    public static int sum = 0;

    public static void calcGame() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println("What is the result of the expression?");
        while (Engine.correctAnswerValue < 3) {
            int randomNumber = random.nextInt(100) + 1;
            int randomNumber2 = random.nextInt(100) + 1;
            if (Engine.correctAnswerValue == 0) {
                sum = randomNumber + randomNumber2;
                Engine.correctAnswer = String.valueOf(sum);
                System.out.println("Question: " + randomNumber + " + " + randomNumber2);
            } else if (Engine.correctAnswerValue == 1) {
                sum = randomNumber - randomNumber2;
                Engine.correctAnswer = String.valueOf(sum);
                System.out.println("Question: " + randomNumber + " - " + randomNumber2);
            } else if (Engine.correctAnswerValue == 2) {
                sum = randomNumber * randomNumber2;
                Engine.correctAnswer = String.valueOf(sum);
                System.out.println("Question: " + randomNumber + " * " + randomNumber2);
            }


            System.out.print("Your answer: ");
            Engine.userAnswer = scanner.next();
            Engine.answerCheck();
        }
        if (Engine.correctAnswerValue == 3) {
            System.out.println("Congratulations, " + Cli.getUserName() + "!");
        }
    }

}
