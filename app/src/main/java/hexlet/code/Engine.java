package hexlet.code;


import hexlet.code.games.Calc;
import hexlet.code.games.GCD;


public class Engine {
    public static int getMaxRound() {
        return maxRound;
    }

    private static final int maxRound = 3;
    private static final int maxRandomNumber = 100;

    public static int getMaxRandomNumber() {
        return maxRandomNumber;
    }

    private static String userAnswer;







    public static int getCorrectAnswerValue() {
        return correctAnswerValue;
    }

    private static String correctAnswer;

    public static void setUserAnswer(String userAnswer) {
        Engine.userAnswer = userAnswer;
    }

    public static void setCorrectAnswer(String correctAnswer) {
        Engine.correctAnswer = correctAnswer;
    }

    public static void setCheckAnswer(boolean checkAnswer) {
        Engine.checkAnswer = checkAnswer;
    }



    private static boolean checkAnswer;
    private static int correctAnswerValue = 0;


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
