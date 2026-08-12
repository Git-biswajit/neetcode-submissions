class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        int[] freq1 = new int[26];
        int[] freq2 = new int[26];
        for(int i=0;i<s.length();i++){
            freq1[s.charAt(i)-'a']++;
        }
        for(int i=0;i<t.length();i++){
            freq2[t.charAt(i)-'a']++;
        }
        int count =0;
        while(count<26){
            if(freq1[count]!=freq2[count]){
                return false;
            }
            count++;
        }
return true;



    }
}
