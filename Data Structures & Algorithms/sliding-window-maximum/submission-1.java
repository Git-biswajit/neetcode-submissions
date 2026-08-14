class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int[] result = new int[nums.length-k+1];
        PriorityQueue<int[]> queue = new PriorityQueue<>((a,b)->Integer.compare(b[0],a[0]));
        for(int right=0;right<nums.length;right++){
            queue.offer(new int[]{nums[right],right});
            int left = right-k+1;
            while(queue.peek()[1]<left){
                queue.poll();
            }
            if(right>=k-1){
                result[left]= queue.peek()[0];
            }
        }
        return result;
        
    }
}
