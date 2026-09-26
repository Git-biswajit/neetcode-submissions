class Solution {
    public int rob(int[] nums) {
      int n = nums.length;
      int[] dp = new int[n+1];
      Arrays.fill(dp,-1);
      int amount = maxAmount(nums,dp,n);
      return amount;        
    }
    public int maxAmount(int[] nums,int[] dp, int n){
      if(n==0){
        return 0;
      }
      if(n==1){
        return nums[0];
      }

      if(dp[n]!=-1){
        return dp[n];
      }
      int rob = nums[n-1] + maxAmount(nums,dp,n-2);
      int skip =0;
      if(n>=2){
       skip = maxAmount(nums,dp,n-1);
      }
      return dp[n] = Math.max(rob,skip);
    }
}
