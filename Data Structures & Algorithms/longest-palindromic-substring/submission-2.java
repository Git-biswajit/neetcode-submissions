class Solution {
    public String longestPalindrome(String s) {
        int n = s.length();
        int maxLen = Integer.MIN_VALUE;
        int start =0;
        for(int i=0;i<n;i++){
            int[] odd = palindrom(s,i,i); 
            int oddPoint = odd[0];
            int oddLen = odd[1];
            if(oddLen>maxLen){
                start = oddPoint;
                maxLen = oddLen;
            }
            int[] even = palindrom(s,i,i+1); 
            int evenPoint = even[0];
            int evenLen = even[1];
            if(evenLen>maxLen){
                start = evenPoint;
                maxLen = evenLen;
            }
            }

        return  s.substring(start,start+maxLen);       
    }
    public int[] palindrom(String s, int left,int right){
        while(left>=0 && right<s.length() && s.charAt(left)==s.charAt(right)){
            left--;
            right++;            
        }
        return new int[]{left+1,right-left-1};
    }
}
