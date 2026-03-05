public class UseCase4PalindromeCheckerApp {
    // Application Name
    private static final String APP_NAME = "Palindrome Checker App";
    // Application Version
    private static final String APP_VERSION = "1.0";

    public static void main(String[] args) {
        // UC4: Character Array Based Palindrome Check
        // Convert string to char[], then compare characters using two pointers.

        System.out.println("================================");
        System.out.println("Palindrome Checker - UseCase 4");
        System.out.println("App: " + APP_NAME + " (v" + APP_VERSION + ")");
        System.out.println("================================");
        System.out.println();

        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.print("Enter a string to check: ");
        String input = scanner.nextLine();

        boolean isPalindrome = checkPalindromeUsingCharArray(input);

        System.out.println();
        if (isPalindrome) {
            System.out.println("Result: \"" + input + "\" is a PALINDROME");
        } else {
            System.out.println("Result: \"" + input + "\" is NOT a PALINDROME");
        }

        scanner.close();
        System.out.println();
        System.out.println("Compile: javac UseCase4PalindromeCheckerApp.java");
        System.out.println("Run    : java UseCase4PalindromeCheckerApp");
    }

    private static boolean checkPalindromeUsingCharArray(String str) {
        if (str == null) {
            return false;
        }

        char[] chars = str.toCharArray();
        int left = 0;
        int right = chars.length - 1;

        while (left < right) {
            if (chars[left] != chars[right]) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
}