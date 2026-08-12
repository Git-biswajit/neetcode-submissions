class Solution {
    int[] dp;
    public int rob(int[] nums) {
        dp = new int[nums.length];
        Arrays.fill(dp,-1);
        int num = dfs(nums,0);
        return num;        
    }
    public int dfs(int[] nums, int i){
      if(i>=nums.length){
        return 0;
      }
      if(dp[i]!=-1){
        return dp[i];
      }
      int take = nums[i] + dfs(nums,i+2);
      int skip = dfs(nums,i+1);
      return dp[i] = Math.max(take,skip);
    }
}
