class Solution {
    public int maxProfit(int[] prices) {
        int minPrice = prices[0];
        int profit =0;
        int maxProfit =0;
        for(int i=1;i<prices.length;i++){
            int currPrice = prices[i];
            minPrice = Math.min(currPrice,minPrice);
            profit = currPrice - minPrice;
            maxProfit = Math.max(profit,maxProfit);
        } 
        return maxProfit;
        
    }
}
