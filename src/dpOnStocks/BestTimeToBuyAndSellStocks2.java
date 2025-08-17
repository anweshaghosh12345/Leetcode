package dpOnStocks;

import java.util.Arrays;

public class BestTimeToBuyAndSellStocks2 {
    public int maxProfit(int[] prices) {
        int[][]dp=new int[prices.length][2];
        for (int[]i:dp){
            Arrays.fill(i,-1);
        }
        return buyAndSell(0,0,prices,dp);
    }
    public int buyAndSell(int i,int buy,int[]prices,int[][]dp){
        if(i==prices.length)
            return 0;
        if(dp[i][buy]!=-1){
            return dp[i][buy];
        }
        int profit;
        if(buy==0){
            profit=Math.max((-prices[i]+buyAndSell(i+1,1,prices, dp)),
                    (buyAndSell(i + 1, 0, prices, dp)));
        }
        else {
            profit=Math.max((prices[i]+buyAndSell(i+1,0,prices, dp)),
                    (buyAndSell(i+1,1,prices, dp)));
        }
        return dp[i][buy]=profit;
    }
}
//int profit=0;
//int buy =prices[0];
//int sell =0;
//        for (int i = 1; i <prices.length ; i++) {
//sell =prices[i]- buy;
//            if(sell>0){
//profit=profit+sell;
//buy=Integer.MAX_VALUE;
//            }
//buy =Math.min(buy,prices[i]);
//        }
//                return profit;