import java.util.Scanner;

public class UseCase9PalindromeCheckerApp {
    // Application Name
    private static final String APP_NAME = "Palindrome Checker App";
    // Application Version
    private static final String APP_VERSION = "1.0";

    public static void main(String[] args) {
        // UC9: Recursive Palindrome Checker
        // Flow:
        // 1) Recursive call compares start & end
        // 2) Base condition exits recursion

        System.out.println("================================");
        System.out.println("Palindrome Checker - UseCase 9");
        System.out.println("App: " + APP_NAME + " (v" + APP_VERSION + ")");
        System.out.println("================================");
        System.out.println();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string to check: ");
        String input = scanner.nextLine();

        boolean isPalindrome = isPalindromeRecursive(input);

        System.out.println();
        if (isPalindrome) {
            System.out.println("Result: \"" + input + "\" is a PALINDROME");
        } else {
            System.out.println("Result: \"" + input + "\" is NOT a PALINDROME");
        }

        scanner.close();

        System.out.println();
        System.out.println("Compile: javac UseCase9PalindromeCheckerApp.java");
        System.out.println("Run    : java UseCase9PalindromeCheckerApp");
    }

    private static boolean isPalindromeRecursive(String str) {
        if (str == null) {
            return false;
        }
        return isPalindromeRecursive(str, 0, str.length() - 1);
    }

    private static boolean isPalindromeRecursive(String str, int start, int end) {
        // Base condition: crossed pointers (or single character left)
        if (start >= end) {
            return true;
        }

        // If mismatch found, stop recursion
        if (str.charAt(start) != str.charAt(end)) {
            return false;
        }

        // Recursive call on smaller substring
        return isPalindromeRecursive(str, start + 1, end - 1);
    }
}