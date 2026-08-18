class Solution {
    public int[][] kClosest(int[][] points, int k) {

        PriorityQueue<int[]> pq = new PriorityQueue<>(
            (a, b) -> b[0] - a[0]
        );

        for (int[] point : points) {
            int a = point[0];
            int b = point[1];

            int sum = a * a + b * b;
            pq.offer(new int[]{sum, a, b});
            if (pq.size() > k) {
                pq.poll();
            }
        }

        int[][] res = new int[k][2];
        int count = 0;
        while (!pq.isEmpty()) {
            int[] point = pq.poll();
            res[count][0] = point[1];
            res[count][1] = point[2];
            count++;
        }

        return res;
    }
}