package hexlet.code;


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


    public static void theGame(String[] questions, String[] answers) {
        Scanner scanner = new Scanner(System.in);
        int correctAnswerValue = 0; // количество правильных ответов
        String correctAnswer; // правильный ответ
        while (correctAnswerValue < getMaxRound()) {

            System.out.println("Question: " + questions[correctAnswerValue]);

            System.out.print("Your answer: ");
            String userAnswer = scanner.next();
            // ПРОВЕРКА
            correctAnswer = answers[correctAnswerValue];

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
        if (correctAnswerValue == getMaxRound()) {
            System.out.println("Congratulations, " + Cli.getUserName() + "!");
        }
    }


}
