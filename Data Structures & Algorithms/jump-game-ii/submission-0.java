class Solution {
    public int jump(int[] nums) {
        int n = nums.length;
        int jump =0;
        int farthest =0;
        int currentEnd =0;
        for(int i=0;i<n-1;i++){
            farthest = Math.max(farthest, i+nums[i]);
            if(i==currentEnd){
                jump++;
                currentEnd = farthest;
            }
    

        }
        return jump;
        
    }
}
