class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int minPrice = prices[0];
        int profit =0;
        int maxProfit =0;
        for(int i=1;i<n;i++){
            int curPrice = prices[i];
            minPrice = Math.min(minPrice,curPrice);
            profit = curPrice - minPrice;
            maxProfit = Math.max(maxProfit,profit); 
        }
        return maxProfit;
        
    }
}
