import java.util.HashMap;

public class Solution {
    public boolean divideArray(int[] nums) {
        // Create a frequency map to count occurrences of each number
        HashMap<Integer, Integer> frequencyMap = new HashMap<>();
        
        for (int num : nums) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }
        
        // Check if all numbers have even occurrences
        for (int count : frequencyMap.values()) {
            if (count % 2 != 0) {
                return false;
            }
        }
        
        return true;
    }
}
