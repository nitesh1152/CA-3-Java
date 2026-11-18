class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        // Handle cases where k is larger than the array length
        k = k % n; 
        
        int[] temp = new int[n];
        
        // Place each element into its new rotated position
        for (int i = 0; i < n; i++) {
            int newIndex = (i + k) % n;
            temp[newIndex] = nums[i];
        }
        
        // Copy the rotated elements back into the original array
        for (int i = 0; i < n; i++) {
            nums[i] = temp[i];
        }
    }
}