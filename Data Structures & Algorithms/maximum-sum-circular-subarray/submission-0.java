class Solution {
    Integer[] Maxmemo;
    Integer[] Minmemo;
    public int maxSubarraySumCircular(int[] nums) {
       Maxmemo = new Integer[nums.length];
       Minmemo = new Integer[nums.length];

         int totalSum =0;
         int MaxArr = nums[0];
         int MinArr = nums[0];
         for(int num:nums){
            totalSum = totalSum+num;
         }
         for(int i=0;i<nums.length;i++){
            MaxArr = Math.max(MaxArr,maxSolve(nums,i));
            MinArr = Math.min(MinArr,minSolve(nums,i));
         }
         if(MaxArr<0){
            return MaxArr;
         }
         return Math.max(MaxArr,totalSum-MinArr);
        
    }
    public int maxSolve(int[] nums, int i){
        if(i==0){
            return nums[0];
        }
        if(Maxmemo[i]!=null){
            return Maxmemo[i];
        }
        Maxmemo[i] = Math.max(nums[i],nums[i]+maxSolve(nums,i-1));
        return Maxmemo[i];
    }
       public int minSolve(int[] nums, int i){
        if(i==0){
            return nums[0];
        }
        if(Minmemo[i]!=null){
            return Minmemo[i];
        }
        Minmemo[i] = Math.min(nums[i],nums[i]+minSolve(nums,i-1));
        return Minmemo[i];
    }
}