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
        while (Engine.getCorrectAnswerValue() < Engine.getMaxRound()) {
            int randomNumber = random.nextInt(Engine.getMaxRandomNumber()) + 1;
            int randomNumber2 = random.nextInt(Engine.getMaxRandomNumber()) + 1;
            if (Engine.getCorrectAnswerValue() == 0) {
                sum = randomNumber + randomNumber2;
                Engine.setCorrectAnswer(String.valueOf(sum));
                System.out.println("Question: " + randomNumber + " + " + randomNumber2);
            } else if (Engine.getCorrectAnswerValue() == 1) {
                sum = randomNumber - randomNumber2;
                Engine.setCorrectAnswer(String.valueOf(sum));
                System.out.println("Question: " + randomNumber + " - " + randomNumber2);
            } else if (Engine.getCorrectAnswerValue() == 2) {
                sum = randomNumber * randomNumber2;
                Engine.setCorrectAnswer(String.valueOf(sum));
                System.out.println("Question: " + randomNumber + " * " + randomNumber2);
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
