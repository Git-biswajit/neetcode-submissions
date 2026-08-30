class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] left = new int[nums.length];
        int[] right = new int[nums.length];
        int[] result = new int[nums.length];
        int product =1;
        for(int i=0;i<nums.length;i++){
            left[i]= product;
            product = product*nums[i];
        }
        product =1;
        for(int i=nums.length-1;i>=0;i--){
            right[i] = product;
            product = product*nums[i];
        }
        for(int i=0;i<nums.length;i++){
            int prod = left[i] * right[i];
            result[i] = prod;
        }
        return result;        
    }
}  
