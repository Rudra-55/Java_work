public class Solution {
    public int maxScore(String s) {
        int n = s.length();
        int maxScore = 0;
        
        // Count the initial number of ones in the string
        int onesInRight = 0;
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == '1') {
                onesInRight++;
            }
        }
        
        int zerosInLeft = 0;
        
        // Iterate from index 1 to n-1 (ensuring non-empty left and right substrings)
        for (int i = 0; i < n - 1; i++) {
            // Update left and right scores based on the split point
            if (s.charAt(i) == '0') {
                zerosInLeft++;
            } else {
                onesInRight--;
            }
            
            // Calculate the score at the current split
            int score = zerosInLeft + onesInRight;
            
            // Update maxScore if the current score is greater
            maxScore = Math.max(maxScore, score);
        }
        
        return maxScore;
    }
}
