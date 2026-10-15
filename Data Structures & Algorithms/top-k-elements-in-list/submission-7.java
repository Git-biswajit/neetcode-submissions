class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int n = nums.length;
        int[] result = new int[k];
        int count =0;
   List<Integer>[] bucket = new List[n + 1];
   for (int i = 0; i <= n; i++) {
    bucket[i] = new ArrayList<>();
    } 
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<n;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
        int key = entry.getKey();
        int value = entry.getValue();
        bucket[value].add(key);
        } 
        for(int i=n;i>=1;i--){
            if(bucket[i]!=null){                
                for(int num:bucket[i]){
                    result[count] = num;
                    count++;
                    if(count==k){
                        return result;
                    }
                }
            }
        }  
        return new int[]{-1};             
    }
}
