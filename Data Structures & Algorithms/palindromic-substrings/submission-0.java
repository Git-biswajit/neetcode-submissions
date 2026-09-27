class Solution {
    public int countSubstrings(String s) {
        int n = s.length();
        int total =0;
        for(int i=0;i<n;i++){
            int odd = palindrom(s,i,i);
            int even = palindrom(s,i,i+1);
            total = total + (odd + even);
        }
        return total;        
    }
    public int palindrom(String s, int left, int right){
        int count=0;
        while(left>=0 && right<s.length() && s.charAt(left)==s.charAt(right)){
            count++;
            left--;
            right++;
        }
        return count;
    }
}
