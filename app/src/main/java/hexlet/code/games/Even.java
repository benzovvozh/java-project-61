package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;


public class Even {
    public static boolean isEven(int randomNumber) {
        boolean even;
        if (randomNumber % 2 == 0) {
            even = true;
        } else {
            even = false;
        }
        return even;
    }


    public static void evenGame() {
        Random random = new Random();

        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");

        // создаем случайные числа-вопросы и записываем их в массив вопросов
        String[] questions = new String[Engine.getMaxRound()];
        boolean[] answers = new boolean[Engine.getMaxRound()];
        for (int i = 0; i < Engine.getMaxRound(); i++) {
            int randomNumber = random.nextInt(Engine.getMaxRandomNumber()) + 1;
            questions[i] = String.valueOf(randomNumber);
            if (isEven(Integer.parseInt(questions[i]))) {
                answers[i] = true;
            } else {
                answers[i] = false;
            }
        }


        Engine.theGame(questions, answers);
    }

}
