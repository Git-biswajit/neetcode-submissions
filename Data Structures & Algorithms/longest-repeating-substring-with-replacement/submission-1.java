class Solution {
    public int characterReplacement(String s, int k) {
        int left =0;
        int maxLen = 0;
        int maxFreq= 0;
        int[] freq = new int[26];
        for(int right=0;right<s.length();right++){
            int ch = s.charAt(right)-'A';
            freq[ch]++;
            maxFreq = Math.max(maxFreq,freq[ch]);
            int diff = (right-left+1) - maxFreq;
            while(diff>k){
                freq[s.charAt(left)-'A']--;
                left++;
                diff = (right-left+1) - maxFreq;
            }
            maxLen = Math.max(maxLen,(right-left+1));
        }
        return maxLen;
        
    }
}
