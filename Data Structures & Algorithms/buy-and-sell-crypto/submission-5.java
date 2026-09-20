class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        if(n==0||n==1){
            return 0;
        }
        int minValue = prices[0];
        int maxProfit = Integer.MIN_VALUE;
        for(int i=1;i<n;i++){
            minValue = Math.min(minValue,prices[i]);
            int profit = prices[i]-minValue;
            maxProfit = Math.max(maxProfit,profit);
        }
        return maxProfit;
        
    }
}
