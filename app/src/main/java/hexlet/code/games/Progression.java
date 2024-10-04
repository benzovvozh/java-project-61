package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

import java.util.Arrays;


public class Progression {
    private static int[] progressionArray;
    private static final int MINPROGRESSIONLENGTH = 5;
    private static final int MAXPROGRESSIONLENGTH = 10;
    private static final int TEN = 10; // для обозначения шага и стартового числа


    private static int[] arithmeticProgression(int length, int start, int step) {

        progressionArray = new int[length]; // пустой массив прогрессии случайной длины
        progressionArray[0] = start; // начинаем со случайного значения
        int x = start;
        for (int i = 1; i < length; i++) { // заполняем массив начиная со второго значения
            progressionArray[i] = x + step;
            x = progressionArray[i];
        }


        return progressionArray;
    }

    private static String replacementOfValue(int miss, int[] array) {
        String[] stringArray = new String[progressionArray.length]; // пустой массив строк
        String progression; // переменная в которой будет храниться строковое представление прогрессии
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


        System.out.println("What number is missing in the progression?");
        String[][] questAndAns = new String[Engine.MAXROUND][2];
        for (int i = 0; i < Engine.MAXROUND; i++) {
            //случайная длина прогрессии от 5 до 10
            int progressionLength = Utils.getRandomInt(MINPROGRESSIONLENGTH, MAXPROGRESSIONLENGTH);
            int startNumber = Utils.getRandomInt(0, TEN); //случайное стартовое число
            int progressionStep = Utils.getRandomInt(0, TEN); //случайное число - шаг прогрессии
            int missingValue = Utils.getRandomInt(0, progressionLength) - 1; // номер пропущенного значения
            int[] array = arithmeticProgression(progressionLength, startNumber, progressionStep);
            questAndAns[i][0] = replacementOfValue(missingValue, array);
            questAndAns[i][1] = String.valueOf(array[missingValue]);
        }
        Engine.theGame(questAndAns);
    }

}
