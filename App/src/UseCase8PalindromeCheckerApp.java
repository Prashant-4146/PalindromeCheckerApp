import java.util.LinkedList;

public class UseCase8PalindromeCheckerApp {
    public static void main(String[] args) {
        LinkedList<Character> linkedList = new LinkedList<>();
        String input = "A man, a plan, a canal, Panama";
        // Normalizing the input: removing non-alphanumeric characters and converting to lowercase
        for (char c : input.toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                linkedList.add(Character.toLowerCase(c));
            }
        }
        // Check if the contents of the linked list form a palindrome
        boolean isPalindrome = true;
        int size = linkedList.size();
        for (int i = 0; i < size / 2; i++) {
            if (!linkedList.get(i).equals(linkedList.get(size - 1 - i))) {
                isPalindrome = false;
                break;
            }
        }
        // Output result
        System.out.println("Is the input a palindrome? " + isPalindrome);
    }
}