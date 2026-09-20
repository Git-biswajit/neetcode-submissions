class Solution {
    public int characterReplacement(String s, int k) {
        int n = s.length();
        int left =0;
        int[] freq = new int[26];
        int maxFreq =0;
        int maxLen =0;
        for(int right=0;right<n;right++){
            int num = s.charAt(right)-'A';
            freq[num]++;
            maxFreq = Math.max(maxFreq,freq[num]);
            int diff = (right-left+1) - maxFreq;
            while(diff>k){
                freq[s.charAt(left)-'A']--;
                left++;
                diff = (right-left+1) - maxFreq;
            }
            maxLen = Math.max(maxLen,right-left+1);

        }
        return maxLen;
    }
}
