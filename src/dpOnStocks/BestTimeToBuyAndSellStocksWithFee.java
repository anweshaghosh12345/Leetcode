package dpOnStocks;

public class BestTimeToBuyAndSellStocksWithFee {
    public int maxProfit(int[] prices, int fee) {
        int[][] dp=new int[prices.length][2];
        for (int i = 0; i <prices.length ; i++) {

                for (int k = 0; k < 2; k++) {
                    dp[i][k]=-1;
                }
            }

        return buyAndSell(0,0,fee,prices,dp);
    }
    public int buyAndSell(int i,int b,int fee,int[]prices,int[][]dp){
        if(i==prices.length)
            return 0;
        int buy=0;
        int notBuy;
        int sell=0;
        int notSell;
        if(dp[i][b]!=-1)
            return dp[i][b];
        if(b==0){
            buy=-prices[i]+buyAndSell(i+1,1,fee,prices, dp);
        }
        notBuy=buyAndSell(i+1,b,fee,prices, dp);
        if(b==1)
        {
            sell=prices[i]-fee+buyAndSell(i+1,0,fee,prices, dp);
        }
        notSell=buyAndSell(i+1,b,fee,prices, dp);
        return dp[i][b]=Math.max(Math.max(buy,notBuy),Math.max(sell,notSell));
    }
}