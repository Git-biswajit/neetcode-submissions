class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int n = nums.length;
        for(int i=0;i<n;i++){
            set.add(nums[i]);
        }
        int max =0;
        for(int i=0;i<n;i++){
            int temp = nums[i];
            int count =1;
            while(set.contains(temp-1)){
                temp--;
                count++;                
            }
            max = Math.max(max,count);
        }
        return max;

        
    }
}
