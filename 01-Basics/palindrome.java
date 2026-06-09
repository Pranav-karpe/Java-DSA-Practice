import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a string or number: ");
        String original = scanner.nextLine();
        
        // Remove spaces and convert to lowercase for an accurate check
        String cleanString = original.replaceAll("\\s+", "").toLowerCase();
        
        // Reverse the clean string
        String reversed = "";
        int length = cleanString.length();
        for (int i = length - 1; i >= 0; i--) {
            reversed += cleanString.charAt(i);
        }
        
        // Check if original and reversed strings match
        if (cleanString.equals(reversed)) {
            System.out.println("\"" + original + "\" is a palindrome.");
        } else {
            System.out.println("\"" + original + "\" is NOT a palindrome.");
        }
        
        // Close the scanner resource
        scanner.close();
    }
}
