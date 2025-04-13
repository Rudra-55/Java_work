public class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
        if (s1.equals(s2)) return true;

        int n = s1.length();
        List<Integer> diff = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                diff.add(i);
            }
        }

        // More than 2 mismatches => not possible in one swap
        if (diff.size() != 2) return false;

        int i = diff.get(0), j = diff.get(1);
        // Check if swapping makes the strings equal
        return s1.charAt(i) == s2.charAt(j) && s1.charAt(j) == s2.charAt(i);
    }
}
