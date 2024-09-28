package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Random;


public class Prime {
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


    public static void primeGame() {
        Random random = new Random();
        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");
        String[] questions = new String[Engine.getMaxRound()];
        for (int i = 0; i < Engine.getMaxRound(); i++) {
            int randomNumber = random.nextInt(Engine.getMaxRandomNumber()) + 1;
            questions[i] = String.valueOf(randomNumber);
        }
        boolean[] answers = new boolean[Engine.getMaxRound()];
        for (int i = 0; i < Engine.getMaxRound(); i++) {
            if (isPrime(Integer.parseInt(questions[i]))) {
                answers[i] = true;
            } else {
                answers[i] = false;
            }
        }
        Engine.theGame(questions, answers);
    }


}
