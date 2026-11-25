package Week3;
import java.util.Random;

public class Ex8 {
    public static void main(String[] args) {
        Random rand = new Random();

        // First letter is always 'A'
        char firstLetter = 'A';

        // Second letter (random uppercase)
        char secondLetter = (char) ('A' + rand.nextInt(26));

        // Generate three random digits
        String digits = "";
        for (int i = 0; i < 3; i++) {
            digits += rand.nextInt(10); // 0–9
        }

        // Generate two random uppercase letters
        String lastTwoLetters = "";
        for (int i = 0; i < 2; i++) {
            lastTwoLetters += (char) ('A' + rand.nextInt(26));
        }

        String plate = "" + firstLetter + secondLetter + " " + digits + " " + lastTwoLetters;

        System.out.println("Generated plate number: " + plate);
    }
}
