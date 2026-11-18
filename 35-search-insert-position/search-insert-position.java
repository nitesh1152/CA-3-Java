class Solution {
    public int searchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        
        // Step 1: Perform Binary Search
        while (left <= right) {
            int mid = left + (right - left) / 2; // Prevents integer overflow
            
            if (nums[mid] == target) {
                return mid; // Target found directly
            } else if (nums[mid] < target) {
                left = mid + 1; // Target must be in the right half
            } else {
                right = mid - 1; // Target must be in the left half
            }
        }
        
        // Step 2: If not found, 'left' points to the exact insertion index
        return left;
    }
}