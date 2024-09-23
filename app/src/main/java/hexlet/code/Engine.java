package hexlet.code;


import hexlet.code.games.Calc;
import hexlet.code.games.GCD;


public class Engine {
    public static String userAnswer;

    public static String correctAnswer;
    public static boolean checkAnswer;
    public static int correctAnswerValue = 0;


    public static void incorrectAnswer() {
        System.out.println(userAnswer + " is wrong answer ;(. Correct answer was " + "'" + correctAnswer + "'");
        System.out.println("Let's try again, " + Cli.getUserName() + "!");
        System.exit(0);
    }

    public static int answerCheck() {
        if ((checkAnswer && userAnswer.equals("yes")) //evengame
                || (!checkAnswer && userAnswer.equals("no"))
                || (userAnswer.equals(String.valueOf(Calc.sum))) //calcgame
                || (userAnswer.equals(String.valueOf(GCD.gcdNumber)))
                || (userAnswer.equals(correctAnswer))) { // progressiongame
            System.out.println("Correct!");
            correctAnswerValue++;
        } else {
            Engine.incorrectAnswer();
        }

        return correctAnswerValue;
    }


}
