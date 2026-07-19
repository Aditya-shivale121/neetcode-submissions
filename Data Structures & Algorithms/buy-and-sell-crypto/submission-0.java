class Solution {
    public int maxProfit(int[] prices) {
        int minbuy = prices[0];
        int maxprofit = 0;
        for(int i = 1 ; i < prices.length ; i++){
            minbuy = Math.min(minbuy , prices[i]);
            maxprofit = Math.max(maxprofit , prices[i] - minbuy);
        }
        return maxprofit;
    }
}
