package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Arrays;
import java.util.Random;


public class Progression {
    private static int[] progressionArray;
    private static final int MINPROGRESSIONLENGTH = 5;
    private static final int MAXPROGRESSIONLENGTH = 10;
    private static final int TEN = 10; // для обозначения шага и стартового числа


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

        Random random = new Random();
        System.out.println("What number is missing in the progression?");
        String[] questions = new String[Engine.getMaxRound()];
        String[] answers = new String[Engine.getMaxRound()];
        for (int i = 0; i < Engine.getMaxRound(); i++) {
            //случайная длина прогрессии от 5 до 10
            int progressionLength = random.nextInt(MINPROGRESSIONLENGTH, MAXPROGRESSIONLENGTH) + 1;
            int startNumber = random.nextInt(TEN) + 1; //случайное стартовое число
            int progressionStep = random.nextInt(TEN) + 1; //случайное число - шаг прогрессии
            int missingValue = random.nextInt(progressionLength); // номер пропущенного значения
            questions[i] = arithmeticProgression(progressionLength, startNumber, progressionStep, missingValue);
            answers[i] = String.valueOf(progressionArray[missingValue]);
        }
        Engine.theGame(questions, answers);
    }

}
