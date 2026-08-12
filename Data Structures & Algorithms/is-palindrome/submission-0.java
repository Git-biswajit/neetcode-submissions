class Solution {
    public boolean isPalindrome(String s) {
        int n = s.length();
        int start =0;
        int end = n-1;
        while(start<=end){
            Character chs = s.charAt(start);
            Character che = s.charAt(end);
            if (!Character.isLetterOrDigit(chs)) {
                start++;
                continue;
            }
            if (!Character.isLetterOrDigit(che)) {
                end--;
                continue;
            }
            if (!Character.valueOf(Character.toLowerCase(chs))
                    .equals(Character.valueOf(Character.toLowerCase(che)))) {
                return false;
            }
            start++;
            end--;
        }
        return true;        
    }
}
