public class Solution {
    public int isPrefixOfWord(String sentence, String searchWord) {
        // Split the sentence into words
        String[] words = sentence.split(" ");
        
        // Loop through each word
        for (int i = 0; i < words.length; i++) {
            // Check if the current word starts with the searchWord
            if (words[i].startsWith(searchWord)) {
                // Return the 1-indexed position of the word
                return i + 1;
            }
        }
        
        // Return -1 if no match is found
        return -1;
    }
}
