class Solution {
    public String longestPalindrome(String s) {
        int n = s.length();
        int start =0;
        int maxLen = 1;
        for(int i=0;i<n;i++){
            int odd = expand(s,i,i);
            int even = expand(s,i,i+1);
            int len = Math.max(odd,even);
            if(len > maxLen){
                maxLen = len;
                start = i-(len-1)/2;
            }
        }
        return s.substring(start,start+maxLen);
        
    }
    public int expand(String s, int start, int end){
        while(start>=0 && end<s.length() && s.charAt(start)==s.charAt(end)){
            start--;
            end++;
        }
        return end-start-1;
    }
}
