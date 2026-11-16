
class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        // Step 1: Count frequency
        Map<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // Step 2: Create Min Heap based on frequency
        PriorityQueue<Map.Entry<Integer, Integer>> queue =
            new PriorityQueue<>((a, b) ->
                Integer.compare(a.getValue(), b.getValue()));

        // Step 3: Maintain only K most frequent elements
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {

            queue.offer(entry);

            if (queue.size() > k) {
                queue.poll();
            }
        }

        // Step 4: Extract K elements
        int[] result = new int[k];

        for (int i = 0; i < k; i++) {
            result[i] = queue.poll().getKey();
        }

        return result;
    }
}
