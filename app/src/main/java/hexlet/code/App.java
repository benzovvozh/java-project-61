package hexlet.code;

import hexlet.code.games.Calc;
import hexlet.code.games.Even;

import java.util.Scanner;

public class App {


    static String userChoice;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("3 - Calc");
        System.out.println("0 - Exit");
        System.out.print("Your choice: ");
        userChoice = scanner.next();
        System.out.println("Welcome to the Brain Games!");
        switch (userChoice) {
            case "1":
                Cli.greeting();
                break;
            case "2":
                Cli.greeting();
                Even.game();
                break;
            case "3":
                Cli.greeting();
                Calc.game();

        }
    }
}
