package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;


public class Even {
    private static final int MAXRANDOMNUMBER = 100;

    private static boolean isEven(int randomNumber) {
        boolean even;
        if (randomNumber % 2 == 0) {
            even = true;
        } else {
            even = false;
        }
        return even;
    }


    public static void evenGame() {


        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");

        // создаем пустой массив вопросов и ответов

        String[][] questAndAns = new String[Engine.MAXROUND][2];

        for (int i = 0; i < Engine.MAXROUND; i++) {
            int randomNumber = Utils.getRandomInt(0, MAXRANDOMNUMBER);
            questAndAns[i][0] = String.valueOf(randomNumber);
            if (isEven(Integer.parseInt(questAndAns[i][0]))) {
                questAndAns[i][1] = "yes";
            } else {
                questAndAns[i][1] = "no";
            }
        }


        Engine.theGame(questAndAns);
    }

}
