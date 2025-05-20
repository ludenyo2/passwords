import java.util.Scanner;

public class Exam1Program {
    public static void main(String[] args) {
        // Create a scanner object to take user input
        Scanner scanner = new Scanner(System.in);

        // Step 1: Ask the user for their first name
        System.out.print("Enter your first name: ");
        String firstname = scanner.nextLine();

        // Step 2: Ask the user for their last name
        System.out.print("Enter your last name: ");
        String lastname = scanner.nextLine();

        // Step 3: Display the hello message
        System.out.println("\nHello, " + firstname + " " + lastname);

        // Step 4: Ask the user to enter 2 uppercase letters
        System.out.print("\nEnter 2 Uppercase letters: ");
        String passwordCharacterOneTwo = scanner.nextLine();

        // Step 6: Ask the user to enter a two-digit integer
        System.out.print("Enter a 2 digit integer: ");
        int passwordCharacterFiveSix = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        // Step 5: Ask the user to enter 2 lowercase letters
        System.out.print("Enter 2 lower case letter: ");
        String passwordCharacterThreeFour = scanner.nextLine();

        // Determine the last character based on the value of passwordCharacterFiveSix
        char lastChar;
        if (passwordCharacterFiveSix < 30) {
            lastChar = '!';
        } else if (passwordCharacterFiveSix >= 30 && passwordCharacterFiveSix <= 59) {
            lastChar = '#';
        } else {
            lastChar = '@';
        }

        // Combine all password characters
        String password = passwordCharacterOneTwo + passwordCharacterThreeFour + passwordCharacterFiveSix + lastChar;

        // Display the password
        System.out.println("\nYour password is: " + password);

        // Close the scanner
        scanner.close();
    }
}
