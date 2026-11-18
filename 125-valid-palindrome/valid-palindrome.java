class Solution {
    public boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            char startChar = s.charAt(left);
            char endChar = s.charAt(right);

            // 1. Skip non-alphanumeric characters from the left
            if (!Character.isLetterOrDigit(startChar)) {
                left++;
            } 
            // 2. Skip non-alphanumeric characters from the right
            else if (!Character.isLetterOrDigit(endChar)) {
                right--;
            } 
            // 3. Compare both characters in lowercase
            else {
                if (Character.toLowerCase(startChar) != Character.toLowerCase(endChar)) {
                    return false; // Mismatch found
                }
                left++;
                right--;
            }
        }

        return true; // All characters matched
    }
}