class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int n = s1.length();
        int left =0;
        int[] freq1 = new int[26];
        for(char ch:s1.toCharArray()){
            freq1[ch-'a']++;
        }
        int[] freq2 = new int[26];
        for(int right = 0;right<s2.length();right++){
            freq2[s2.charAt(right)-'a']++;
            int len = right-left+1;
            if(len>=n){
                if(isMatching(freq2,freq1)){
                    return true;
                }
                freq2[s2.charAt(left)-'a']--;
                left++;
            }

        }
        return false;
    }       
    
    public boolean isMatching(int[] freq2, int[] freq1){
        for(int i=0;i<26;i++){
            if(freq2[i]!=freq1[i]){
                return false;
            }
        }
        return true;
    }
}

