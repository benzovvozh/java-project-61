package hexlet.code;

import java.util.Random;

public class Utils {
    public static int getRandomInt(int a, int b) {
        Random random = new Random();
        int randomNumber = random.nextInt(a, b) + 1;
        return randomNumber;
    }
}
