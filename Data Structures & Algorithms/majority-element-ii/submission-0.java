class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n = nums.length;
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<n;i++){
            int num = nums[i];
            map.put(num,map.getOrDefault(num,0)+1);
        }
        int k = n/3;
        List<Integer> list = new ArrayList<>();
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            if(entry.getValue()>k){
                list.add(entry.getKey());
            }
        }
        return list;                 
        
    }
}