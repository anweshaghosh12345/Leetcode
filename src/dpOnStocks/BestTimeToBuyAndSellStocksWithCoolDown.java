package dpOnStocks;

import java.util.Arrays;

public class BestTimeToBuyAndSellStocksWithCoolDown {
    public int maxProfit(int[] prices) {
        int[][][]dp=new int[prices.length][2][2];
        for (int[][]i:dp){
            for (int[]j:i)
                Arrays.fill(j,-1);
        }
        return buyAndSell(0,0,0,prices,dp);
    }
    public int buyAndSell(int i, int b, int cooldown, int[]prices, int[][][]dp){
        if(i==prices.length)
            return 0;
        if(dp[i][b][cooldown]!=-1){
            return dp[i][b][cooldown];
        }

        int buy = 0;
        int notbuy;
        int sell = 0;
        int notsell;
        if(b ==0&& cooldown==0){
           buy=-prices[i]+buyAndSell(i+1,1,0,prices,dp);
        }
        notbuy=buyAndSell(i+1,0,0,prices,dp);
        if(b==1){
            sell=prices[i]+buyAndSell(i+1,0,1,prices,dp);
        }
        notsell=buyAndSell(i+1,b,cooldown,prices,dp);

        return dp[i][b][cooldown]=Math.max(Math.max(buy,notbuy),Math.max(sell,notsell));
    }
}