public class Solution {
    public String clearDigits(String s) {  // was removeDigits
        StringBuilder stack = new StringBuilder();

        for (char ch : s.toCharArray()) {
            if (Character.isDigit(ch)) {
                if (stack.length() > 0) {
                    stack.setLength(stack.length() - 1);
                }
            } else {
                stack.append(ch);
            }
        }

        return stack.toString();
    }
}
