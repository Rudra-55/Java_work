import java.util.Stack;

public class Solution {
    public int[] finalPrices(int[] prices) {
        int n = prices.length;
        int[] answer = new int[n];
        Stack<Integer> stack = new Stack<>();
        
        // Traverse from right to left
        for (int i = n - 1; i >= 0; i--) {
            // Pop items from the stack where the price is greater than the current price
            while (!stack.isEmpty() && prices[stack.peek()] > prices[i]) {
                stack.pop();
            }
            
            // If stack is not empty, apply the discount
            if (!stack.isEmpty()) {
                answer[i] = prices[i] - prices[stack.peek()];
            } else {
                answer[i] = prices[i];
            }
            
            // Push the current index to the stack
            stack.push(i);
        }
        
        return answer;
    }
}
