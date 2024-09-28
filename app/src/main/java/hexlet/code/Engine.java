package hexlet.code;

import java.util.Random;
import java.util.Scanner;


public class Engine {
    public static int getMaxRound() {
        return MAXROUND;
    }

    private static final int MAXROUND = 3;
    private static final int MAXRANDOMNUMBER = 100;

    public static int getMaxRandomNumber() {
        return MAXRANDOMNUMBER;
    }

    private static String answerUser;


    public static int getCorrectAnswerValue() {
        return correctAnswerValue;
    }


    public static String getCorrectAnswer() {
        return correctAnswer;
    }

    private static String correctAnswer;

    public static void setUserAnswer(String userAnswer) {
        Engine.answerUser = userAnswer;
    }

    public static void setCorrectAnswer(String theCorrectAnswer) {
        Engine.correctAnswer = correctAnswer;
    }

    public static void setCheckAnswer(boolean theCheckAnswer) {
        Engine.checkAnswer = checkAnswer;
    }


    private static boolean checkAnswer;

    public static boolean isCheckAnswer() {
        return checkAnswer;
    }

    private static int correctAnswerValue = 0;

    public static void incorrectAnswer() {
        System.out.println(answerUser + " is wrong answer ;(. Correct answer was " + "'" + correctAnswer + "'");
        System.out.println("Let's try again, " + Cli.getUserName() + "!");
        System.exit(0);
    }

    public static int answerCheck() {
        if ((checkAnswer && answerUser.equals("yes")) || (!checkAnswer && answerUser.equals("no")) // even/prime game
                || (answerUser.equals(getCorrectAnswer())) // calc/progression game
                || (answerUser.equals(String.valueOf(getCorrectAnswer())))) { // gcd game
            System.out.println("Correct!");
            correctAnswerValue++;
        } else {
            Engine.incorrectAnswer();
        }

        return correctAnswerValue;
    }


    public static void theGame(String[] questions, boolean[] answers) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        while (getCorrectAnswerValue() < getMaxRound()) {

            System.out.println("Question: " + questions[getCorrectAnswerValue()]);

            System.out.print("Your answer: ");
            Engine.setUserAnswer(scanner.next());
            // ПРОВЕРКА
            checkAnswer = answers[getCorrectAnswerValue()];
            answerCheck();

        }
        if (getCorrectAnswerValue() == getMaxRound()) {
            System.out.println("Congratulations, " + Cli.getUserName() + "!");
        }
    }

    public static void theGame(String[] questions, String[] answers) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        while (getCorrectAnswerValue() < getMaxRound()) {

            System.out.println("Question: " + questions[getCorrectAnswerValue()]);

            System.out.print("Your answer: ");
            Engine.setUserAnswer(scanner.next());
            // ПРОВЕРКА
            correctAnswer = answers[getCorrectAnswerValue()];
            answerCheck();

        }
        if (getCorrectAnswerValue() == getMaxRound()) {
            System.out.println("Congratulations, " + Cli.getUserName() + "!");
        }
    }


}
