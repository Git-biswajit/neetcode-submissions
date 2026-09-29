class Solution {
    public int coinChange(int[] coins, int amount) {
        int[] dp = new int[amount+1];
        Arrays.fill(dp,-1);
        int minCoin = minCoins(coins,amount,dp);
        return minCoin==Integer.MAX_VALUE?-1:minCoin;        
    }
    public int minCoins(int[] coins, int amount,int[] dp){
        if(amount==0){
            return 0;
        }
        if(amount<0){
            return Integer.MAX_VALUE;
        }
        if (dp[amount] != -1) {
            return dp[amount];
        }
        int maxValue = Integer.MAX_VALUE;
        for(int i=0;i<coins.length;i++){
            int result = minCoins(coins,amount-coins[i],dp);
            if (result != Integer.MAX_VALUE) {
                maxValue = Math.min(maxValue, result + 1);
            }

        }
        return dp[amount] = maxValue;

    }
}
