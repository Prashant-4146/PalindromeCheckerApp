import java.util.Scanner;

public class UseCase10PalindromeCheckerApp {
    // Application Name
    private static final String APP_NAME = "Palindrome Checker App";
    // Application Version
    private static final String APP_VERSION = "1.0";

    public static void main(String[] args) {
        // UC10: Case-Insensitive & Space-Ignored Palindrome
        // Flow:
        // 1) Normalize string
        // 2) Apply palindrome logic

        System.out.println("================================");
        System.out.println("Palindrome Checker - UseCase 10");
        System.out.println("App: " + APP_NAME + " (v" + APP_VERSION + ")");
        System.out.println("================================");
        System.out.println();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string to check: ");
        String input = scanner.nextLine();

        // Normalize: ignore spaces + ignore case
        String normalized = input.toLowerCase().replaceAll("\\s+", "");

        boolean isPalindrome = isPalindromeTwoPointer(normalized);

        System.out.println();
        System.out.println("Normalized: \"" + normalized + "\"");
        System.out.println();

        if (isPalindrome) {
            System.out.println("Result: \"" + input + "\" is a PALINDROME");
        } else {
            System.out.println("Result: \"" + input + "\" is NOT a PALINDROME");
        }

        scanner.close();

        System.out.println();
        System.out.println("Compile: javac UseCase10PalindromeCheckerApp.java");
        System.out.println("Run    : java UseCase10PalindromeCheckerApp");
    }

    // Two-pointer palindrome check (efficient, no extra reversal objects)
    private static boolean isPalindromeTwoPointer(String str) {
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}