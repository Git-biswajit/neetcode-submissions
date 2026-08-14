class Solution {
    public String minWindow(String s, String t) {

        if (s.length() < t.length()) {
            return "";
        }

        int left = 0;
        int minLen = Integer.MAX_VALUE;
        int start = 0;

        int[] source = new int[128];
        int[] target = new int[128];

        for (int i = 0; i < t.length(); i++) {
            target[t.charAt(i)]++;
        }

        for (int right = 0; right < s.length(); right++) {

            source[s.charAt(right)]++;

            while (isValid(source, target)) {

                int len = right - left + 1;

                if (len < minLen) {
                    minLen = len;
                    start = left;
                }

                source[s.charAt(left)]--;
                left++;
            }
        }

        if (minLen == Integer.MAX_VALUE) {
            return "";
        }

        return s.substring(start, start + minLen);
    }

    public boolean isValid(int[] source, int[] target) {
        for (int i = 0; i < 128; i++) {
            if (source[i] < target[i]) {
                return false;
            }
        }
        return true;
    }
}