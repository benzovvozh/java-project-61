package hexlet.code;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("0 - Exit");
        System.out.print("Your choice: ");
        String userChoice = scanner.next();
        System.out.println("Welcome to the Brain Games!");
        switch (userChoice) {
            case "1":
                Cli.greeting();
                break;
            case "2":
                Cli.greeting();
                Even.evenGame();
                break;
        }
    }
}
