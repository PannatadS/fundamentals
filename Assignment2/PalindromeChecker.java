package Assignment2;

public class PalindromeChecker {
    public static void main(String[] args) {
        // Concept - Read backward & forward same
        int [] expectedTrue1 = {1, 2, 3, 3, 2, 1};
        System.out.println("expectedTrue1: " + isPalindrome(expectedTrue1));
        int [] expectedTrue2 = {1, 2, 3, 2, 1};
        System.out.println("expectedTrue2: " + isPalindrome(expectedTrue2));
        int [] expectedFalse = {1, 2, 3, 8, 7, 3, 2, 1};
        System.out.println("expectedFalse: " + isPalindrome(expectedFalse));
    }

    private static boolean isPalindrome (int [] arr) {
        int left = 0;
        int right = arr.length - 1;
        while (left < right) {
            if (arr[left] != arr[right]) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
