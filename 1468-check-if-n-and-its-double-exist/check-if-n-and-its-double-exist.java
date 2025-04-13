import java.util.HashSet;

public class Solution {
    public boolean checkIfExist(int[] arr) {
        // Create a set to keep track of the numbers we've seen
        HashSet<Integer> seen = new HashSet<>();
        
        // Iterate through the array
        for (int num : arr) {
            // Check if num * 2 or num / 2 exists in the set
            if (seen.contains(num * 2) || (num % 2 == 0 && seen.contains(num / 2))) {
                return true;
            }
            // Add the current number to the set
            seen.add(num);
        }
        
        // Return false if no such pair is found
        return false;
    }
}
