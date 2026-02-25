public class UseCase2PalindromeCheckerApp {
    // Hardcoded string to check for palindrome
    private static final String TEST_STRING = "madam";
    
    public static void main(String[] args) {
        // UC2: Print Hardcoded Palindrome Result
        // Check if the hardcoded string is a palindrome
        
        System.out.println("================================");
        System.out.println("Palindrome Checker - UseCase 2");
        System.out.println("================================");
        System.out.println();
        
        // Display the string being checked
        System.out.println("Input String: " + TEST_STRING);
        
        // Check if the string is a palindrome
        boolean isPalindrome = checkPalindrome(TEST_STRING);
        
        // Print the result
        System.out.println();
        if (isPalindrome) {
            System.out.println("Result: \"" + TEST_STRING + "\" is a PALINDROME");
        } else {
            System.out.println("Result: \"" + TEST_STRING + "\" is NOT a PALINDROME");
        }
        System.out.println();
    }
    
    // Method to check if a string is a palindrome
    private static boolean checkPalindrome(String str) {
        // Remove spaces and convert to lowercase for comparison
        String cleanStr = str.toLowerCase().replaceAll("\\s+", "");
        
        // Compare the string with its reverse
        String reversed = new StringBuilder(cleanStr).reverse().toString();
        
        return cleanStr.equals(reversed);
    }
}