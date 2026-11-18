class Solution {
    public int firstMissingPositive(int[] nums) {
        int n = nums.length;
        int i = 0;

        // Step 1: Place each valid number (1 to n) at its correct index (num - 1)
        while (i < n) {
            int correctIndex = nums[i] - 1;

            // Check if nums[i] is in range [1, n] and not already at its correct position
            if (nums[i] > 0 && nums[i] <= n && nums[i] != nums[correctIndex]) {
                // Swap nums[i] with nums[correctIndex]
                int temp = nums[i];
                nums[i] = nums[correctIndex];
                nums[correctIndex] = temp;
            } else {
                // Move forward only when current index has a valid/ignorable number
                i++;
            }
        }

        // Step 2: Find the first index that doesn't hold (index + 1)
        for (int index = 0; index < n; index++) {
            if (nums[index] != index + 1) {
                return index + 1;
            }
        }

        // Step 3: If all numbers 1..n are present, return n + 1
        return n + 1;
    }
}