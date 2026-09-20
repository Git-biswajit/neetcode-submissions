class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int maxNum = 0;
        for(int pile:piles){
            if(pile>maxNum){
                maxNum = pile;
            }
        }
        int left = 1;
        int right = maxNum;
        int minRate =0;
        while(left<=right){
            int mid = left + (right-left)/2;
            if(isValid(piles,mid,h)){
                minRate = mid;
                right = mid-1;
            }
            else{
                left = mid+1;
            }
            
        }
        return minRate;
        
    }
    public boolean isValid(int[] piles,int mid,int h){
        int val =0;
        for(int pile:piles){
           val += (int) Math.ceil((double) pile / mid);
        }
        if(val>h){
            return false;
        }
        return true;
    }
}
