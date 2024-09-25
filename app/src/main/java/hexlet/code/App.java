package hexlet.code;

import hexlet.code.games.*;

import javax.swing.plaf.synth.SynthUI;
import java.util.Scanner;

public class App {


    static String userChoice;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("3 - Calc");
        System.out.println("4 - GCD");
        System.out.println("5 - Progression");
        System.out.println("6 - Prime");
        System.out.println("0 - Exit");
        System.out.print("Your choice: ");
        userChoice = scanner.next();
        switch (userChoice) {
            case "1":
                Cli.greeting();
                break;
            case "2":
                Cli.greeting();
                Even.evenGame();
                break;
            case "3":
                Cli.greeting();
                Calc.calcGame();
                break;
            case "4":
                Cli.greeting();
                GCD.gcdGame();
                break;
            case "5":
                Cli.greeting();
                Progression.progressionGame();
                break;
            case "6":
                Cli.greeting();
                Prime.primeGame();
                break;
            case "0":
                System.exit(0);
                break;

        }
    }
}
