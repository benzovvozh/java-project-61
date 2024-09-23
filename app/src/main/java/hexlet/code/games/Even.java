package hexlet.code.games;


import hexlet.code.Cli;
import hexlet.code.Engine;

import java.util.Random;
import java.util.Scanner;


public class Even {


    public static void evenGame() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        while (Engine.correctAnswerValue < 3) {
            int randomNumber = random.nextInt(100) + 1;
            System.out.println("Question: " + randomNumber);
            if (randomNumber % 2 == 0) {
                Engine.checkAnswer = true;
                Engine.correctAnswer = "yes";
            } else {
                Engine.checkAnswer = false;
                Engine.correctAnswer = "no";
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
