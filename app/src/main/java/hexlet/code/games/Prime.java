package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;


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
        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");
        String[] questions = new String[Engine.getMaxRound()];
        for (int i = 0; i < Engine.getMaxRound(); i++) {
            int randomNumber = Utils.getRandomInt(0, Engine.getMaxRandomNumber());
            questions[i] = String.valueOf(randomNumber);
        }
        String[] answers = new String[Engine.getMaxRound()];
        for (int i = 0; i < Engine.getMaxRound(); i++) {
            if (isPrime(Integer.parseInt(questions[i]))) {
                answers[i] = "yes";
            } else {
                answers[i] = "no";
            }
        }
        Engine.theGame(questions, answers);
    }


}
