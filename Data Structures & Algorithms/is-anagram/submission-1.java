class Solution {
    public boolean isAnagram(String s, String t) {
        int[] arrs = new int[26];
        int[] arrt = new int[26];
        for(int i=0;i<s.length();i++){
            arrs[s.charAt(i)-'a']++;
        }
        for(int i=0;i<t.length();i++){
            arrt[t.charAt(i)-'a']++;
        }
        for(int i=0;i<26;i++){
            if(arrs[i]!=arrt[i]){
                return false;
            }
        }
        return true;
    }
}
