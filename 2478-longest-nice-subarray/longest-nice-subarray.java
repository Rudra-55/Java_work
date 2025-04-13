public class Solution {
    public int longestNiceSubarray(int[] nums) {
        int left = 0;
        int maxLength = 1; // Single element subarrays are always nice
        
        // We will use a variable to track the bitwise OR of the current window
        int currentOr = 0;
        
        for (int right = 0; right < nums.length; right++) {
            // Try to expand the window by including nums[right]
            // If the bitwise AND with the current window OR is not zero, we need to move the left pointer
            while ((currentOr & nums[right]) != 0) {
                // Remove nums[left] from the window by shifting the left pointer
                currentOr ^= nums[left];
                left++;
            }
            
            // Add nums[right] to the window and update the OR
            currentOr |= nums[right];
            
            // Calculate the current window length and update maxLength
            maxLength = Math.max(maxLength, right - left + 1);
        }
        
        return maxLength;
    }
}
