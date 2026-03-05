import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class UseCase6PalindromeCheckerApp {
    // Application Name
    private static final String APP_NAME = "Palindrome Checker App";
    // Application Version
    private static final String APP_VERSION = "1.0";

    public static void main(String[] args) {
        // UC6: Queue + Stack Based Palindrome Check
        // Goal: Demonstrate FIFO vs LIFO using Queue and Stack.
        // Flow:
        // 1) Enqueue characters (Queue - FIFO)
        // 2) Push characters (Stack - LIFO)
        // 3) Compare dequeue vs pop

        System.out.println("================================");
        System.out.println("Palindrome Checker - UseCase 6");
        System.out.println("App: " + APP_NAME + " (v" + APP_VERSION + ")");
        System.out.println("================================");
        System.out.println();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string to check: ");
        String input = scanner.nextLine();

        boolean isPalindrome = checkPalindromeUsingQueueAndStack(input);

        System.out.println();
        if (isPalindrome) {
            System.out.println("Result: \"" + input + "\" is a PALINDROME");
        } else {
            System.out.println("Result: \"" + input + "\" is NOT a PALINDROME");
        }

        scanner.close();

        System.out.println();
        System.out.println("Compile: javac UseCase6PalindromeCheckerApp.java");
        System.out.println("Run    : java UseCase6PalindromeCheckerApp");
    }

    private static boolean checkPalindromeUsingQueueAndStack(String str) {
        if (str == null) {
            return false;
        }

        Queue<Character> queue = new LinkedList<>();
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            queue.add(ch);
            stack.push(ch);
        }

        while (!queue.isEmpty()) {
            char fromQueue = queue.remove();
            char fromStack = stack.pop();

            if (fromQueue != fromStack) {
                return false;
            }
        }

        return true;
    }
}