import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an odd-length word: ");
        String word = scanner.next();

        // Check if the word has an odd length
        if (word.length() % 2 == 0) {
            System.out.println("The word does not have an odd length.");
        } else {
            // Calculate the index of the middle character
            int middleValue = word.length() / 2;

            // Print the middle character
            char middleChar = word.charAt(middleValue);
            System.out.println("The middle character is: " + middleChar);
        }




    }
}