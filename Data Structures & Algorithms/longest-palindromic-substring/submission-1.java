class Solution {

    public String longestPalindrome(String s) {

        int n = s.length();

        if (n <= 1) {
            return s;
        }

        int maxLen = 1;
        int start = 0;

        for (int i = 0; i < n; i++) {

            int[] odd = palindrom(s, i, i);

            if (odd[1] > maxLen) {
                maxLen = odd[1];
                start = odd[0];
            }

            int[] even = palindrom(s, i, i + 1);

            if (even[1] > maxLen) {
                maxLen = even[1];
                start = even[0];
            }
        }

        return s.substring(start, start + maxLen);
    }

    public int[] palindrom(String s, int left, int right) {

        while (left >= 0 &&
               right < s.length() &&
               s.charAt(left) == s.charAt(right)) {

            left--;
            right++;
        }

        return new int[]{left + 1, right - left - 1};
    }
}