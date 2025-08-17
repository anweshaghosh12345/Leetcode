package dpOnStocks;

public class BestTimeToBuyAndSellStocks {
    public int maxProfit(int[] prices) {
    int profit=0;
    int min=prices[0];
    int sell =0;
        for (int i = 1; i <prices.length ; i++) {
            sell =prices[i]-min;
            profit=Math.max(profit,sell);
            min=Math.min(min,prices[i]);
        }
        return profit;
    }
}
