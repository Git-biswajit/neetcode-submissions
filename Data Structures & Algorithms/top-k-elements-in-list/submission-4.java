class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> map = new HashMap<>();
        int[] result = new int[k];
        for(int i=0;i<nums.length;i++){
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        for(int i=0;i<k;i++){
            int max = findMax(map);
            map.remove(max);
            result[i]=max;
        }
        return result;       
    }
    public int findMax(Map<Integer, Integer> map) {
    int maxFreq = 0;
    int maxKey = 0;

    for (int key : map.keySet()) {
        if (map.get(key) > maxFreq) {
            maxFreq = map.get(key);
            maxKey = key;
        }
    }

    return maxKey;
}

}
