class Solution {
    public int lengthOfLastWord(String s) {
        // Step 1: Remove extra spaces from the start and end
        s = s.trim();
        
        int length = 0;
        
        // Step 2: Loop backwards from the last character
        for (int i = s.length() - 1; i >= 0; i--) {
            // Stop counting as soon as we hit a space
            if (s.charAt(i) == ' ') {
                break;
            }
            length++;
        }
        
        return length;
    }
}