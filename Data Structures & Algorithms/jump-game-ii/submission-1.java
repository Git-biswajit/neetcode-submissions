class Solution {
    public int jump(int[] nums) {
        int n = nums.length;
        int farthest = 0;
        int jump =0;
        int currentEnd =0;
        for(int i=0;i<n-1;i++){
            farthest = Math.max(farthest,nums[i]+i);
            if(i==currentEnd){
                jump++;
                currentEnd = farthest;
            }       
        }
        return jump;
        
    }
}
