class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> map = new HashMap<>();
        int n = nums.length;
        int[] result = new int[k];
        List<Integer>[] bucket = new List[n + 1];
        for(int i=0;i<n;i++){
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }        
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            int key = entry.getKey();
            int value = entry.getValue();
                if (bucket[value] == null) {
                bucket[value] = new ArrayList<>();
               }
            bucket[value].add(key);
        } 
        List<Integer> list = new ArrayList<>();
        int count =0;
        for(int i=n;i>0;i--){

            if(bucket[i]!=null){  
                for(int num:bucket[i]){
                    result[count]= num;
                    count++;
                    if(count==k){
                        return result;
                    }

                }             

            }
        }
        return new int[]{};

    }
}
