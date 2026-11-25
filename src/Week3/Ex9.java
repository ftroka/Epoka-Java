package Week3;
import java.util.Scanner;

public class Ex9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter string s1: ");
        String s1 = input.nextLine();

        System.out.print("Enter string s2: ");
        String s2 = input.nextLine();

        boolean found = false;

        for (int i = 0; i <= s1.length() - s2.length(); i++) {

            boolean match = true;

            for (int j = 0; j < s2.length(); j++) {

                if (s1.charAt(i + j) != s2.charAt(j)) {
                    match = false;
                    break;
                }
            }

            if (match) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println(s2 + " is a substring of " + s1);
        } else {
            System.out.println(s2 + " is not a substring of " + s1);
        }

        input.close();
    }
}
