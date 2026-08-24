class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int count =0;
        int maxcount =0;
        for(int num:nums){
            set.add(num);
        }
        for(int num:nums){
            if(!set.contains(num-1)){
                int k = num;
                count=0;
                while(set.contains(k)){
                    k++;
                    count++;
                }
            }
            maxcount = Math.max(maxcount,count);

        }
        return maxcount;
        
    }
}
