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
        while (Engine.getCorrectAnswerValue() < Engine.getMaxRound()) {
            int randomNumber = random.nextInt(Engine.getMaxRandomNumber()) + 1;
            System.out.println("Question: " + randomNumber);
            if (randomNumber % 2 == 0) {
                Engine.setCheckAnswer(true);
                Engine.setCorrectAnswer("yes");
            } else {
                Engine.setCheckAnswer(false);
                Engine.setCorrectAnswer("no");
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
