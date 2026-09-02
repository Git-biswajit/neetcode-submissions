class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int right =0;
        int left =1;
        int maxNum =0;
        int ans = Integer.MAX_VALUE;
        for(int pile:piles){
            maxNum = Math.max(maxNum,pile);
        }
        right = maxNum;
        while(left<=right){
            int mid = left + (right-left)/2;
            if(isPossible(mid,h,piles)){
                ans = mid;
                right = mid-1;
            }
            else{
                left = mid +1;
            }

        }
        return ans;
        
    }
    public boolean isPossible(int mid, int h,int[] piles){
        int hr =0;
        for(int pile:piles){
            hr = hr + (int)Math.ceil((double)pile/mid);
        }
        if(hr>h){
            return false;
        }
        return true;
    }
}
