
package Week2;

import java.util.Scanner;

public class Ex9 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first name: ");
        String firstName = sc.nextLine();

        System.out.print("Enter last name: ");
        String lastName = sc.nextLine();

        firstName = firstName.trim();
        lastName = lastName.trim();

        int fullNameLength = firstName.length() + lastName.length();

        char firstInitial = Character.toUpperCase(firstName.charAt(0));
        char lastInitial = Character.toUpperCase(lastName.charAt(0));

        String formattedName = lastName.toUpperCase() + ", " + firstName;
        sc.close();
        System.out.println("\nFull name length: " + fullNameLength);
        System.out.println("Initials: " + firstInitial + "." + lastInitial + ".");
        System.out.println("Formatted name: " + formattedName);
    }
}
