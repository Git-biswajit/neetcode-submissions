class Solution {
    public int[][] kClosest(int[][] points, int k) {
        int n = points.length;
       PriorityQueue<int[]> pq =
    new PriorityQueue<>((a, b) ->b[0]-a[0]);
        for(int[] point:points){
            int x = point[0];
            int y = point[1];
            int distance = x * x + y * y;
            pq.offer(new int[]{distance,x,y});
            if(pq.size()>k){
                pq.poll();
            }
        }
        int[][] result = new int[k][2];
        int count =0;
        while(!pq.isEmpty()){
            int[] temp = pq.poll();
            result[count][0] = temp[1];
            result[count][1] = temp[2];
            count++;
        } 
        return result;  

    }
}
