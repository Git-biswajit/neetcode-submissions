class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        int[] dp = new int[n+1];
        Arrays.fill(dp,-1);
        return minCost(cost,dp,n);        
    }
    public int minCost(int[] cost,int[] dp, int n){
        if(n==0 || n==1){
            return 0;
        }
        if(dp[n]!=-1){
            return dp[n];
        }
        int firstStep = minCost(cost,dp,n-1)+cost[n-1];
        int secondStep = 0;
        if(n>=2){
        secondStep = minCost(cost,dp,n-2)+cost[n-2];
        }
        dp[n]  = Math.min(firstStep, secondStep);
        return dp[n];
    }
}
