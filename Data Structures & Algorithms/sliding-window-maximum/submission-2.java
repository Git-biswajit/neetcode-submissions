class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b)->b-a);
        int[] result = new int[n-k+1];
        for(int i=0;i<k;i++){
            pq.add(nums[i]);
        }
        result[0] = pq.peek();
        int count = 1;
        int left =0;
        for(int right=k;right<n;right++){
            pq.remove(nums[left]);

            pq.add(nums[right]);

            result[count++] = pq.peek();

            left++;
        }
        return result;        
    }
}
