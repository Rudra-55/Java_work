import java.util.*;

public class Solution {
    public List<String> stringMatching(String[] words) {
        List<String> result = new ArrayList<>();
        
        // Loop through each word
        for (int i = 0; i < words.length; i++) {
            // Check if the current word is a substring of any other word
            for (int j = 0; j < words.length; j++) {
                // Avoid checking the word with itself
                if (i != j && words[j].contains(words[i])) {
                    result.add(words[i]);
                    break; // No need to check further once we find a match
                }
            }
        }
        
        return result;
    }
}
