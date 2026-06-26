class Solution {

    public int expand(String s, int left, int right) {
        int count = 0;

        while (left >= 0 &&
               right < s.length() &&
               s.charAt(left) == s.charAt(right)) {

            count++;
            left--;
            right++;
        }

        return count;
    }

    public int countSubstrings(String s) {
        int ans = 0;

        for (int i = 0; i < s.length(); i++) {

            // odd length palindromes
            ans += expand(s, i, i);

            // even length palindromes
            ans += expand(s, i, i + 1);
        }

        return ans;
    }
}