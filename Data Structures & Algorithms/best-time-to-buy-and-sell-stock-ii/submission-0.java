class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int profit =0;
        for(int i=1;i<n;i++){
            int diff = prices[i] - prices[i-1];
            if(diff>0){
             profit = profit+diff;
            }
        }
        return profit;
                
    }
}