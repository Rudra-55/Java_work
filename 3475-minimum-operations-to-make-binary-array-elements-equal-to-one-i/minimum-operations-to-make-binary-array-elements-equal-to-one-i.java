public class Solution {
    public int minOperations(int[] nums) {
        int operations = 0;
        int n = nums.length;
        
        // Traverse the array from left to right
        for (int i = 0; i < n - 2; i++) {
            if (nums[i] == 0) {
                // If nums[i] is 0, flip the next 3 elements
                nums[i] = 1 - nums[i];
                nums[i + 1] = 1 - nums[i + 1];
                nums[i + 2] = 1 - nums[i + 2];
                operations++;
            }
        }
        
        // After the loop, check if there are any remaining 0's
        for (int i = 0; i < n; i++) {
            if (nums[i] == 0) {
                return -1; // It's impossible to flip this 0 since we don't have enough elements left
            }
        }
        
        return operations;
    }
}
