class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int left = 1;
        int right =0;
        for(int pile:piles){
            right = Math.max(right,pile);
        } 
        int ans = right;
        while(left<=right){
            int mid = left + (right-left)/2;
            if(isPossible(piles,mid,h)){
                ans = mid;
                right = mid-1;
            }
            else{
                left = mid+1;
            }
        } 
        return ans;     
    }
    public boolean isPossible(int[] piles,int k,int h){
       int hr =0;
       for(int pile:piles){
       hr += (pile + k - 1) / k;
       }
       if(hr>h){
        return false;
       }
       return true;
    }
}
