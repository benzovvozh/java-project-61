package hexlet.code;


import java.util.Scanner;


public class Engine {
    public static final int MAXROUND = 3;

    public static void theGame(String[][] questionsAndAnswers) {
        Scanner scanner = new Scanner(System.in);
        int correctAnswerValue = 0; // количество правильных ответов
        String correctAnswer; // правильный ответ
        while (correctAnswerValue < MAXROUND) {

            System.out.println("Question: " + questionsAndAnswers[correctAnswerValue][0]);

            System.out.print("Your answer: ");
            String userAnswer = scanner.next();
            // ПРОВЕРКА
            correctAnswer = questionsAndAnswers[correctAnswerValue][1];

            if ((userAnswer.equals(correctAnswer)) || (userAnswer.equals(correctAnswer)) // even/prime game
                    || (userAnswer.equals(correctAnswer)) // calc/progression game
                    || (userAnswer.equals(String.valueOf(correctAnswer)))) { // gcd game
                System.out.println("Correct!");
                correctAnswerValue++;
            } else {
                System.out.println(userAnswer + " is wrong answer ;(. Correct answer was " + "'" + correctAnswer + "'");
                System.out.println("Let's try again, " + Cli.getUserName() + "!");
                System.exit(0);
            }

        }
        if (correctAnswerValue == MAXROUND) {
            System.out.println("Congratulations, " + Cli.getUserName() + "!");
        }
    }


}
