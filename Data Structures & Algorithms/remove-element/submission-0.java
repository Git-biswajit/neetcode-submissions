class Solution {
    public int removeElement(int[] nums, int val) {
        int count =0;
        for(int right=0;right<nums.length;right++){
            if(nums[right]!=val){
                nums[count] = nums[right];
                count++;
            }

        }
        return count;
    }
}