class Solution {
    public boolean isPalindrome(int x) {
        // 1. Negative numbers are never palindromes (e.g., -121 != 121-)
        if (x < 0) {
            return false;
        }

        int original = x; // Save the original number to compare later
        int reversed = 0;

        // 2. Reverse the number digit by digit
        while (x > 0) {
            int lastDigit = x % 10;              // Get the last digit
            reversed = (reversed * 10) + lastDigit; // Add it to the reversed number
            x = x / 10;                          // Remove the last digit from x
        }

        // 3. Check if the reversed number matches the original
        return original == reversed;
    }
}