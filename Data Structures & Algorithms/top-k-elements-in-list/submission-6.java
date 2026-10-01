class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int n = nums.length;
        Map<Integer,Integer> map = new HashMap<>();
        List<Integer>[] bucket = new List[n+1];
        for(int i=0;i<n;i++){
            int num = nums[i];
            map.put(num,map.getOrDefault(num,0)+1);            
        } 
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            int key = entry.getKey();
            int value = entry.getValue();
            if(bucket[value]==null){
                bucket[value] = new ArrayList<>();
            }
            bucket[value].add(key);
        } 
        int[] result = new int[k];
        int count=0;
        for(int i=n;i>0;i--){
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
        return new int[]{};
 
        
    }
}
