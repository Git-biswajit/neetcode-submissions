class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        if (n == 1) {
            return nums[0];
        }
        int[] dp1 = new int[n+1];
        Arrays.fill(dp1,-1);
        int[] dp2 = new int[n+1];
        Arrays.fill(dp2,-1);
        int[] dp = new int[n+1];
        return Math.max(hrb(nums,dp1,0,n-1),hrb(nums,dp2,1,n));        
    }
    public int hrb(int[] nums,int[] dp,int left,int right){
        if(right<=left){
            return 0;
        }
        if(dp[right]!=-1){
            return dp[right];
        }
        int rob = nums[right-1] + hrb(nums,dp,left,right-2);
        int skip = hrb(nums,dp,left,right-1);
        return dp[right]= Math.max(rob,skip);
        
    }
}
