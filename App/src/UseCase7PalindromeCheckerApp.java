import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class UseCase7PalindromeCheckerApp {
    // Application Name
    private static final String APP_NAME = "Palindrome Checker App";
    // Application Version
    private static final String APP_VERSION = "1.0";

    public static void main(String[] args) {
        // UC7: Deque-Based Optimized Palindrome Checker
        // Flow:
        // 1) Insert characters into deque
        // 2) Remove first & last
        // 3) Compare until empty / size <= 1

        System.out.println("================================");
        System.out.println("Palindrome Checker - UseCase 7");
        System.out.println("App: " + APP_NAME + " (v" + APP_VERSION + ")");
        System.out.println("================================");
        System.out.println();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string to check: ");
        String input = scanner.nextLine();

        boolean isPalindrome = checkPalindromeUsingDeque(input);

        System.out.println();
        if (isPalindrome) {
            System.out.println("Result: \"" + input + "\" is a PALINDROME");
        } else {
            System.out.println("Result: \"" + input + "\" is NOT a PALINDROME");
        }

        scanner.close();

        System.out.println();
        System.out.println("Compile: javac UseCase7PalindromeCheckerApp.java");
        System.out.println("Run    : java UseCase7PalindromeCheckerApp");
    }

    private static boolean checkPalindromeUsingDeque(String str) {
        if (str == null) {
            return false;
        }

        Deque<Character> deque = new ArrayDeque<>();

        // Insert characters into deque
        for (int i = 0; i < str.length(); i++) {
            deque.addLast(str.charAt(i));
        }

        // Remove first & last and compare
        while (deque.size() > 1) {
            char front = deque.removeFirst();
            char rear = deque.removeLast();

            if (front != rear) {
                return false;
            }
        }

        return true;
    }
}