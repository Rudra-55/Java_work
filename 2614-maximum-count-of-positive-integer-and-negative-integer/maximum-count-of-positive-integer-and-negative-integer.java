public class Solution {
    public int maximumCount(int[] nums) {
        int negCount = 0;
        int posCount = 0;
        
        // Count negative numbers
        for (int num : nums) {
            if (num < 0) {
                negCount++;
            } else if (num > 0) {
                posCount++;
            }
        }

        // Return the maximum of negative and positive counts
        return Math.max(negCount, posCount);
    }
}
