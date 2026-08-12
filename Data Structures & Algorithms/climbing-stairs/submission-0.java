class Solution {
    public int climbStairs(int n) {
        Integer[] memo = new Integer[n+1];
    int res = climb(n,memo);
    return res;            
    }
    public int climb(int n,Integer[] memo){
        if(n<=2){
            return n;
        }
        if(memo[n]!=null){
            return memo[n];
        }
        memo[n] = climb(n-1,memo)+climb(n-2,memo);
        return memo[n];
    }
}
