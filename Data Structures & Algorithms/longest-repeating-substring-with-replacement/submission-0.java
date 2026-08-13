class Solution {
    public int characterReplacement(String s, int k) {
        int left =0;
        int maxLen =0;
        int maxFreq =0;
        int[] arr = new int[26];
        for(int right=0;right<s.length();right++){
            arr[s.charAt(right)-'A']++;
            maxFreq = Math.max(maxFreq,arr[s.charAt(right)-'A']);
            int diff = (right-left+1) - maxFreq;
            while(diff>k){
                arr[s.charAt(left)-'A']--;
                left++;
                diff = (right-left+1)-maxFreq;
            }
            maxLen = Math.max(maxLen,right-left+1);
        }
        return maxLen;                
    }
}
