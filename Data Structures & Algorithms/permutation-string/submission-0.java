class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int n1 = s1.length();
        int n2 = s2.length();
        int[] s1Count = new int[26];
        int[] s2Count = new int[26];
        for(int i=0;i<n1;i++){
            s1Count[s1.charAt(i)-'a']++;
        }
        int left =0;
        for(int right=0;right<n2;right++){
            s2Count[s2.charAt(right)-'a']++;
            if(right-left+1>n1){
                s2Count[s2.charAt(left)-'a']--;
                left++;
            }
            if(matches(s1Count,s2Count)){
                return true;
            }

        }
        return false;
        
    }
    public boolean matches(int[] s1Count,int[] s2Count){
        for(int i=0;i<26;i++){
            if(s1Count[i]!=s2Count[i]){
                return false;
            }           
        }
         return true;
    }
}
