import java.util.*;

public class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        List<Integer> lessThanPivot = new ArrayList<>();
        List<Integer> equalToPivot = new ArrayList<>();
        List<Integer> greaterThanPivot = new ArrayList<>();

        // Categorize elements into three groups
        for (int num : nums) {
            if (num < pivot) {
                lessThanPivot.add(num);
            } else if (num == pivot) {
                equalToPivot.add(num);
            } else {
                greaterThanPivot.add(num);
            }
        }

        // Concatenate the three lists: less than, equal to, and greater than pivot
        lessThanPivot.addAll(equalToPivot);
        lessThanPivot.addAll(greaterThanPivot);

        // Convert List to array and return
        int[] result = new int[nums.length];
        for (int i = 0; i < lessThanPivot.size(); i++) {
            result[i] = lessThanPivot.get(i);
        }

        return result;
    }
}
