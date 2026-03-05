import java.util.Scanner;

public class UseCase11PalindromeCheckerApp {

    // UC11: Object-Oriented Palindrome Service
    // Goal: Encapsulate palindrome logic in a class (encapsulation + SRP)

    static class PalindromeChecker {
        // Expose checkPalindrome() method
        public boolean checkPalindrome(String input) {
            if (input == null) return false;

            // Internal data structure: char[] (index-based comparison)
            char[] chars = input.toCharArray();
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

    public static void main(String[] args) {
        System.out.println("================================");
        System.out.println("Palindrome Checker - UseCase 11");
        System.out.println("================================");
        System.out.println();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string to check: ");
        String input = scanner.nextLine();

        PalindromeChecker palindromeChecker = new PalindromeChecker();
        boolean isPalindrome = palindromeChecker.checkPalindrome(input);

        System.out.println();
        if (isPalindrome) {
            System.out.println("Result: \"" + input + "\" is a PALINDROME");
        } else {
            System.out.println("Result: \"" + input + "\" is NOT a PALINDROME");
        }

        scanner.close();

        System.out.println();
        System.out.println("Compile: javac UseCase11PalindromeCheckerApp.java");
        System.out.println("Run    : java UseCase11PalindromeCheckerApp");
    }
}