class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int maxElement = 0;
        for(int i=0;i<piles.length;i++){
            maxElement = Math.max(maxElement,piles[i]);
        }  
        int right = maxElement;
        int left = 1;
        int result = Integer.MAX_VALUE;;
        while(left<right){
            int mid = left  + (right-left)/2;
            if(isPossible(piles,mid,h)){
                if(mid<result){
                    right = mid;
                }
            }
            else{
                left = mid+1;
            }
        }
        return right;        
    }
    public boolean isPossible(int[] piles,int mid, int h){
            int time =0;
            for(int pile:piles){
            time += (int) Math.ceil((double) pile / mid);
            }
            if(time>h){
                return false;
            }
            return true;
        } 
}
