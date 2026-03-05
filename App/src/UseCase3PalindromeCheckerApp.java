public class UseCase3PalindromeCheckerApp {
    // Application Name
    private static final String APP_NAME = "Palindrome Checker App";
    // Application Version
    private static final String APP_VERSION = "1.0";

    public static void main(String[] args) {
        // UC3: Palindrome Check Using String Reverse
        // Reverse string using loop, compare original and reversed, display result

        System.out.println("================================");
        System.out.println("Palindrome Checker - UseCase 3");
        System.out.println("App: " + APP_NAME + " (v" + APP_VERSION + ")");
        System.out.println("================================");
        System.out.println();

        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.print("Enter a string to check: ");
        String input = scanner.nextLine();

        // Reverse the string using a for loop (and string concatenation)
        String reversed = "";
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed = reversed + input.charAt(i);
        }

        System.out.println();
        System.out.println("Original : \"" + input + "\"");
        System.out.println("Reversed : \"" + reversed + "\"");

        // Compare original and reversed using equals()
        boolean isPalindrome = input.equals(reversed);

        System.out.println();
        if (isPalindrome) {
            System.out.println("Result: \"" + input + "\" is a PALINDROME");
        } else {
            System.out.println("Result: \"" + input + "\" is NOT a PALINDROME");
        }

        scanner.close();
        System.out.println();
        System.out.println("Compile: javac UseCase3PalindromeCheckerApp.java");
        System.out.println("Run    : java UseCase3PalindromeCheckerApp");
    }
}