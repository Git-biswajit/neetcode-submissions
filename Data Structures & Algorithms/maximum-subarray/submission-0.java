class Solution {
      Integer[] memo;
    public int maxSubArray(int[] nums) {
        memo = new Integer[nums.length];
        int max = nums[0];
        for(int i=1;i<nums.length;i++){
            max = Math.max(max,solve(nums,i));
        } 
        return max;    
        
    }
    public int solve(int[] nums,int i){
        if(i==0){
            return nums[0];
        }
        if(memo[i]!=null){
            return memo[i];
        }
        memo[i] = Math.max(nums[i],nums[i]+solve(nums,i-1));
        return memo[i];
    }
}
