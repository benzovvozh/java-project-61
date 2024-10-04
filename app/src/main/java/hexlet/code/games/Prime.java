package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;


public class Prime {
    private static final int MAXRANDOMNUMBER = 100;

    private static boolean isPrime(int number) {
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
        String[][] questAndAns = new String[Engine.MAXROUND][2];
        for (int i = 0; i < Engine.MAXROUND; i++) {
            int randomNumber = Utils.getRandomInt(0, MAXRANDOMNUMBER);
            questAndAns[i][0] = String.valueOf(randomNumber);
            if (isPrime(Integer.parseInt(questAndAns[i][0]))) {
                questAndAns[i][1] = "yes";
            } else {
                questAndAns[i][1] = "no";
            }
        }
        Engine.theGame(questAndAns);
    }


}
