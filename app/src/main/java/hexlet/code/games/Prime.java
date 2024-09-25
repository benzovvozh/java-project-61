package hexlet.code.games;

import hexlet.code.Cli;
import hexlet.code.Engine;

import java.util.Random;
import java.util.Scanner;

public class Prime {
    public static void primeGame() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");
        while (Engine.getCorrectAnswerValue() < Engine.getMaxRound()) {
            int randomNumber = random.nextInt(Engine.getMaxRandomNumber()) + 1;
            System.out.println("Question: " + randomNumber);
            if (isPrime(randomNumber)) {
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

    public static boolean isPrime(int number) {
        if (number < 2) {
            return false;

        }
        int divider = 2;
        while (divider <= number / 2) {
            if (number % divider == 0) {
                return false;
            }
            divider++;
        }
        return true;
    }
}
