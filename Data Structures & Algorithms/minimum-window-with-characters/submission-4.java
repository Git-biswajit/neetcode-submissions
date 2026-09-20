class Solution {
    public String minWindow(String s, String t) {
        if (s.length() < t.length()) {
            return "";
        }
        int[] freqt = new int[128];
        int start = 0;
        int left=0;
        int minLen = Integer.MAX_VALUE;
        for(int i=0;i<t.length();i++){
            freqt[t.charAt(i)]++;
        }

        int[] freqs = new int[128];
        for(int right=0;right<s.length();right++){
            freqs[s.charAt(right)]++;
            while(isValid(freqt,freqs)){
                int len = right-left+1;
                if(len<minLen){
                    start= left;
                    minLen = len;
                }
                freqs[s.charAt(left)]--;
                left++;            
            }                      
        }
        if (minLen == Integer.MAX_VALUE) {
            return "";
        }
        return s.substring(start,start+minLen);        
    }
    public boolean isValid(int[] freqt,int[] freqs){
        for(int i=0;i<128;i++){
            if(freqt[i]>freqs[i]){
                return false;
            }
        }
        return true;
    }
}
