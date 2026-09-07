class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        if(n==1){
            return 0;
        }
        int min = prices[0];
        int max = Integer.MIN_VALUE;
        for(int i =1;i<n;i++){
            min = Math.min(min,prices[i]);
            int diff = prices[i]-min;
            max = Math.max(max,diff);
        }
        return max;                
    }
}
