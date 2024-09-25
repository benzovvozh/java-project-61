package hexlet.code.games;

import hexlet.code.Cli;
import hexlet.code.Engine;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Progression {
    private static int[] progressionArray;
    private static int minProgressionLength = 5;
    private static int maxProgressionLength = 10;



    public static String arithmeticProgression(int length, int start, int step, int miss) {
        String progression; // переменная в которой будет храниться строковое представление прогрессии
        progressionArray = new int[length]; // пустой массив прогрессии случайной длины
        progressionArray[0] = start; // начинаем со случайного значения
        int x = start;
        for (int i = 1; i < length; i++) { // заполняем массив начиная со второго значения
            progressionArray[i] = x + step;
            x = progressionArray[i];
        }


        // конвертируем в массив строк
        String[] stringArray = new String[progressionArray.length];
        for (int i = 0; i < progressionArray.length; i++) {
            if (i == miss) {
                stringArray[i] = "..";
            } else {
                stringArray[i] = String.valueOf(progressionArray[i]);
            }
        }
        // преобразуем массив в строку
        progression = Arrays.toString(stringArray);
        // избавляемся от скобок
        progression = progression.replaceAll("\\[", "").replaceAll("\\]", "");
        progression = progression.replaceAll(",", "");
        return progression;
    }

    public static void progressionGame() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println("What number is missing in the progression?");


        while (Engine.getCorrectAnswerValue() < Engine.getMaxRound()) {
            //случайная длина прогрессии от 5 до 10
            int progressionLength = random.nextInt(minProgressionLength, maxProgressionLength) + 1;
            int startNumber = random.nextInt(10) + 1; //случайное стартовое число
            int progressionStep = random.nextInt(10) + 1; //случайное число - шаг прогрессии
            int missingValue = random.nextInt(progressionLength); // номер пропущенного значения

            String some = arithmeticProgression(progressionLength, startNumber, progressionStep, missingValue);
            Engine.setCorrectAnswer(String.valueOf(progressionArray[missingValue])); // задаем правильный ответ
            System.out.println("Question: " + some);


            System.out.print("Your answer: ");
            Engine.setUserAnswer(scanner.next());
            Engine.answerCheck();
        }
        if (Engine.getCorrectAnswerValue() == Engine.getMaxRound()) {
            System.out.println("Congratulations, " + Cli.getUserName() + "!");
        }

    }

}
