package hexlet.code;


import java.util.Scanner;
import java.util.Random;


public class Engine {
    static String userAnswer;
    static String correctAnswer;
    static boolean checkAnswer;
    static int correctAnswerValue = 0;
    static int sum = 0;


    public static void incorrectAnswer() {
        System.out.println(userAnswer + " is wrong answer ;(. Correct answer was " + "'" + correctAnswer + "'");
        System.out.println("Let's try again, " + Cli.getUserName() + "!");
        System.exit(0);
    }

    public static int answerCheck() {
        if ((checkAnswer && userAnswer.equals("yes")) || (sum == Integer.parseInt(userAnswer))
                || (!checkAnswer && userAnswer.equals("no"))) {
            System.out.println("Correct!");
            correctAnswerValue++;
        } else {
            Engine.incorrectAnswer();
        }

        return correctAnswerValue;
    }

    public static void evenGame() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        while (correctAnswerValue < 3) {
            int randomNumber = random.nextInt(100) + 1;
            System.out.println("Question: " + randomNumber);
            if (randomNumber % 2 == 0) {
                checkAnswer = true;
                correctAnswer = "yes";
            } else {
                checkAnswer = false;
                correctAnswer = "no";
            }
            System.out.print("Your answer: ");
            userAnswer = scanner.next();
            answerCheck();
        }
        if (correctAnswerValue == 3) {
            System.out.println("Congratulations, " + Cli.getUserName() + "!");
        }
    }

    public static void calcGame() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        while (correctAnswerValue < 3) {
            int randomNumber = random.nextInt(100) + 1;
            int randomNumber2 = random.nextInt(100) + 1;
            if (correctAnswerValue == 0) {
                sum = randomNumber + randomNumber2;
                correctAnswer = String.valueOf(sum);
                System.out.println("Question: " + randomNumber + " + " + randomNumber2);
            } else if (correctAnswerValue == 1) {
                sum = randomNumber - randomNumber2;
                correctAnswer = String.valueOf(sum);
                System.out.println("Question: " + randomNumber + " - " + randomNumber2);
            } else if (correctAnswerValue == 2) {
                sum = randomNumber * randomNumber2;
                correctAnswer = String.valueOf(sum);
                System.out.println("Question: " + randomNumber + " * " + randomNumber2);
            }


            System.out.print("Your answer: ");
            userAnswer = scanner.next();
            answerCheck();
        }
        if (correctAnswerValue == 3) {
            System.out.println("Congratulations, " + Cli.getUserName() + "!");
        }
    }


}
