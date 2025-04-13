public class Solution {
    public boolean checkPowersOfThree(int n) {
        while (n > 0) {
            if (n % 3 == 2) {
                return false; // If remainder is 2, it's not possible
            }
            n /= 3; // Divide n by 3
        }
        return true;
    }
}
