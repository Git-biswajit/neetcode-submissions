class Solution {
    public int[] sortArray(int[] nums) {
        quicksort(nums, 0, nums.length - 1);
        return nums;       
    }
    public void quicksort(int[] nums, int low, int high){
        if(low<high){
            int pi = partition(nums,low,high);        
            quicksort(nums, low, pi - 1);
            quicksort(nums, pi + 1, high);
        }

    }
    public int partition(int[] nums,int low,int high){
        int pivot = nums[high];
        int i = low-1;
        for(int j=low;j<high;j++){
            if(nums[j]<=pivot){
                i++;
                swap(nums,i,j);
            }
        }
        swap(nums,i+1,high);
        return i+1;
    }
    public void swap(int[] nums, int low, int high){
        int temp = nums[low];
        nums[low] = nums[high];
        nums[high]= temp;
    }
}