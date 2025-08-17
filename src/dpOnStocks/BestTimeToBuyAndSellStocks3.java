package dpOnStocks;

import java.util.Arrays;

public class BestTimeToBuyAndSellStocks3 {
    public int maxProfit(int[] p) {
        int [][][]dp=new int[p.length][2][2];
        for (int [][]i: dp) {
            for (int[]j:i){
                Arrays.fill(j,-1);
            }
        }
        return buyAndSell(0,0,0, p,dp);
    }
    public int buyAndSell(int i,int buy,int op,int[]p,int[][][]dp){
        if(op==2)
            return 0;
        if(i==p.length)
            return 0;
        if(dp[i][buy][op]!=-1){
            return dp[i][buy][op];
        }
        int profit=0;

            if(buy==0){
              profit=Math.max((-p[i]+buyAndSell(i+1,1,op,p, dp)),
                      (buyAndSell(i+1,0,op,p, dp)));
            }
            else {
                profit=Math.max((p[i]+buyAndSell(i+1,0,op+1,p, dp)),
                        (buyAndSell(i+1,buy,op,p, dp)));
            }

        return dp[i][buy][op]= profit;
    }
}