class Solution {
    
    public int rob(int[] nums) {
        if(nums.length==1){
             return nums[0];
        }
       int[] dp1 = new int[nums.length];
       int[] dp2 = new int[nums.length];

        Arrays.fill(dp1,-1);
        Arrays.fill(dp2,-1);
        return Math.max(rob(nums,0,nums.length-2,dp1),rob(nums,1,nums.length-1,dp2));        
    }
    public int rob(int[] nums, int s, int e, int[] dp){
        if(s>e){
            return 0;
        }
        if(dp[s]!=-1){
            return dp[s];
        }
        int take = nums[s] + rob(nums,s+2,e,dp);
        int skip = rob(nums,s+1,e,dp);
        return dp[s] = Math.max(take,skip);
    }
}
