class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        // List<List<Integer>> result = new ArrayList<>();
        Set<List<Integer>> set = new HashSet<>();  
        for(int i=0;i<n;i++){
            int num = nums[i]; 
            int left =0;
            int right = n-1;       
            while(left<right){
                if(left==i){
                    left++;
                }
                else if(right==i){
                    right--;
                }
                if(left >= right) break;
                int tar = nums[left] + nums[right];
                if(tar==-(num)){
                //  result.add(Arrays.asList(num, nums[left], nums[right]));
                List<Integer> ans = Arrays.asList(num, nums[left], nums[right]);
                Collections.sort(ans);
                set.add(ans);
                 left++;
                 right--;
                }
                else if(tar>-num){
                  right--;
                }
                else{
                    left++;
                }

            }

        }
        return new ArrayList<>(set);    
    }
}
