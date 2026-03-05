import java.util.Scanner;
import java.util.Stack;

public class UseCase5PalindromeCheckerApp {
    // Application Name
    private static final String APP_NAME = "Palindrome Checker App";
    // Application Version
    private static final String APP_VERSION = "1.0";

    public static void main(String[] args) {
        // UC5: Stack-Based Palindrome Checker
        // Flow:
        // 1) Push characters into stack
        // 2) Pop and compare
        // 3) Print result

        System.out.println("================================");
        System.out.println("Palindrome Checker - UseCase 5");
        System.out.println("App: " + APP_NAME + " (v" + APP_VERSION + ")");
        System.out.println("================================");
        System.out.println();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string to check: ");
        String input = scanner.nextLine();

        boolean isPalindrome = checkPalindromeUsingStack(input);

        System.out.println();
        if (isPalindrome) {
            System.out.println("Result: \"" + input + "\" is a PALINDROME");
        } else {
            System.out.println("Result: \"" + input + "\" is NOT a PALINDROME");
        }

        scanner.close();

        System.out.println();
        System.out.println("Compile: javac UseCase5PalindromeCheckerApp.java");
        System.out.println("Run    : java UseCase5PalindromeCheckerApp");
    }

    private static boolean checkPalindromeUsingStack(String str) {
        if (str == null) {
            return false;
        }

        Stack<Character> stack = new Stack<>();

        // Push characters into stack
        for (int i = 0; i < str.length(); i++) {
            stack.push(str.charAt(i));
        }

        // Pop and compare
        for (int i = 0; i < str.length(); i++) {
            char fromStack = stack.pop();
            if (str.charAt(i) != fromStack) {
                return false;
            }
        }

        return true;
    }
}