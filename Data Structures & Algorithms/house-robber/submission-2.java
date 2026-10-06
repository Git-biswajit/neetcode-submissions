class Solution {
    public int rob(int[] nums) {
        int n = nums.length;

        int[] dp = new int[n];
        Arrays.fill(dp, -1);

        return robber(nums, dp, n - 1);
    }

    public int robber(int[] nums, int[] dp, int index) {

        // No houses left
        if (index < 0) {
            return 0;
        }

        // Already calculated
        if (dp[index] != -1) {
            return dp[index];
        }

        // Take current house
        int rob = nums[index] + robber(nums, dp, index - 2);

        // Skip current house
        int skip = robber(nums, dp, index - 1);

        return dp[index] = Math.max(rob, skip);
    }
}