import java.util.*;

public class Solution {
    public int[] getFinalState(int[] nums, int k, int multiplier) {
        for (int i = 0; i < k; i++) {
            int minIndex = 0;

            // Find index of first occurrence of the minimum value
            for (int j = 1; j < nums.length; j++) {
                if (nums[j] < nums[minIndex]) {
                    minIndex = j;
                }
            }

            // Replace it with nums[minIndex] * multiplier
            nums[minIndex] *= multiplier;
        }

        return nums;
    }
}
