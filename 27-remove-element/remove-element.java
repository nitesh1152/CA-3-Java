class Solution {
    public int removeElement(int[] nums, int val) {
        int k = 0; // Tracks the index for elements we want to keep

        // Loop through every element in the array
        for (int i = 0; i < nums.length; i++) {
            // If the current element is NOT the value to remove
            if (nums[i] != val) {
                nums[k] = nums[i]; // Move it to the front
                k++;               // Move the 'keep' pointer forward
            }
        }

        return k; // Return the total count of kept elements
    }
}