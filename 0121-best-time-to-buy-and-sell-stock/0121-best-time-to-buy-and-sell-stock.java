class Solution {
    public int maxProfit(int[] prices) {
        int m = prices[0];
        int profit =0;
        for(int i =0;i<prices.length;i++)
        {
            int cost = prices[i] - m;
            profit = Math.max(profit,cost);
            m = Math.min(m,prices[i]);
            
        }
        return profit;
    }
}