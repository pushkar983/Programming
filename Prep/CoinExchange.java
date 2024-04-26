package Prep;

import java.util.Arrays;

class CoinExchange {
    public static void main(String[] args) {
        int [] coins = {1,2,3,5};
        int k = 8;
        //initialize dp
        int [] dp = new int[k+1];
        Arrays.fill(dp, 0);

        dp[0] = 1;
        System.out.println(Arrays.toString(dp));
        for(int coin : coins){
            for(int i = coin;i<=k;i++){
                dp[i]+=dp[i-coin];
            }
            System.out.println(Arrays.toString(dp));
        }
        System.out.println(dp[k]);
    }    
}