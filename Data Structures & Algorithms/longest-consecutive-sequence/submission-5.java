class Solution {
    public int longestConsecutive(int[] nums) {
        int n = nums.length;
        if(n==0){
            return 0;
        }
        Set<Integer> set = new HashSet<>();
        int maxm = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            set.add(nums[i]);
        } 
        for(int i=0;i<n;i++){
            int num = nums[i];
            int count=0;
            if(!set.contains(num-1)){   
                int diff = num;
                while(set.contains(diff)){
                count++;
                diff++;
                }
                
            }
            maxm = Math.max(maxm, count);
        } 
        return maxm;      
    }
}
