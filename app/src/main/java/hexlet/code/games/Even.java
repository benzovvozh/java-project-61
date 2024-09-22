package hexlet.code;

import java.util.Scanner;
import java.util.Random;

public class Even {
    static String userAnswer;
    static String correctAnswer;
    static boolean checkEven;
    static int correctAnswerValue = 0;


    public static void incorrectAnswer() {
        System.out.println(userAnswer + "is wrong answer ;(. Correct answer was " + "'" + correctAnswer + "'");
        System.out.println("Let's try again, " + Cli.userName + "!");
        System.exit(0);
    }

    public static int answerCheck() {
        if (checkEven == true && userAnswer.equals("yes")) {
            System.out.println("Correct!");
            correctAnswerValue++;
        } else if (!userAnswer.equals("yes") && !userAnswer.equals("no")) {
            incorrectAnswer();
        } else if (checkEven == true && userAnswer.equals("no")) {
            incorrectAnswer();
        } else if (checkEven == false && userAnswer.equals("no")) {
            System.out.println("Correct!");
            correctAnswerValue++;
        } else if (checkEven == false && userAnswer.equals("yes")) {
            incorrectAnswer();
        }
        return correctAnswerValue;
    }

    public static void evenGame() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        while (correctAnswerValue < 3) {
            int randomNumber = random.nextInt(100) + 1;
            System.out.println("Question: " + randomNumber);
            if (randomNumber % 2 == 0) {
                checkEven = true;
                correctAnswer = "yes";
            } else {
                checkEven = false;
                correctAnswer = "no";
            }
            System.out.print("Your answer: ");
            userAnswer = scanner.next();
            answerCheck();
        }
        if (correctAnswerValue == 3)
            System.out.println("Congratulations, " + Cli.userName + "!");


    }

}
