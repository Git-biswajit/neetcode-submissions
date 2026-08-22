class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left =0;
        int maxLen =0;
        int start=0;
        Set<Character> set = new HashSet<>();
        for(int right=0;right<s.length();right++){
           while(set.contains(s.charAt(right))){
            set.remove(s.charAt(left));
            left++;
           }
           set.add(s.charAt(right));
           int len = right-left+1;
            if(len>maxLen){
                maxLen = Math.max(len,maxLen);
                start = left;
            }
        }
        return s.substring(start, start + maxLen).length();  
    }
}
