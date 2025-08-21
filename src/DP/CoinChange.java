package DP;

public class CoinChange {
    public int coinChange(int[] coins, int amount) {
        int [] dp=new int[amount+1];
        for (int i = 1; i <=amount ; i++) {
            dp[i]=Integer.MAX_VALUE;
        }
        for (int i = 1; i <=amount ; i++) {
            for (int coin:coins){
                if(coin<=i && dp[i-coin]!=Integer.MAX_VALUE){
                    dp[i]=Math.min(dp[i],1+dp[i]-coin);
                }
            }
        }
        if(dp[amount]==Integer.MAX_VALUE)
            return -1;
        return dp[amount];
    }
}