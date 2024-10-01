package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;


public class Even {
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

        // создаем случайные числа-вопросы и записываем их в массив вопросов
        String[] questions = new String[Engine.getMaxRound()];
        String[] answers = new String[Engine.getMaxRound()];
        for (int i = 0; i < Engine.getMaxRound(); i++) {
            int randomNumber = Utils.getRandomInt(0, Engine.getMaxRandomNumber());
            questions[i] = String.valueOf(randomNumber);
            if (isEven(Integer.parseInt(questions[i]))) {
                answers[i] = "yes";
            } else {
                answers[i] = "no";
            }
        }


        Engine.theGame(questions, answers);
    }

}
