class Solution {
    public boolean checkValidString(String s) {
        int minopen =0;
        int maxopen =0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                minopen++;
                maxopen++;
            }
            else if(s.charAt(i)==')'){
                minopen--;
                maxopen--;
            }
            else{
                minopen--;
                maxopen++;
            }
            minopen = Math.max(0,minopen);
            if (maxopen < 0) {
                return false;
            }
        }
        return minopen==0;
        
    }
}
