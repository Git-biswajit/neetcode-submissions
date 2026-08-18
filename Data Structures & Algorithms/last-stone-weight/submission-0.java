class Solution {
    public int lastStoneWeight(int[] stones) {
     PriorityQueue<Integer> pq = new PriorityQueue<>((a,b)->(b-a));
     int n = stones.length;
     for(int i=0;i<n;i++){
        pq.offer(stones[i]);
     }
     while(pq.size()>1){
        int a = pq.poll();
        int b = pq.poll();
        if(a>b){
            pq.offer(a-b);
        }
        else if(b<a){
            pq.offer(b-a);
        }
        else{
          pq.offer(0);
        }
     }
     return pq.poll();
        
    }
}
