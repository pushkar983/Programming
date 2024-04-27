package DP.OneD;

import java.util.Arrays;
import java.util.HashMap;

public class HouseRobber {

    // Sticker Theif
    public static void main(String[] args) {
        int [] money = {1,2,1,2};
        //             0,1,2,3  -> houses
        // a theif has to steal max rupees + no adjacent house
        // here ans : 1+3 -> 4(max)
        
        // Bottom up approach

        System.out.println(solve(money));
    }

    private static int solve(int[] money) {
        int [] dp = new int [money.length+1];
        if(money.length==0)
            return 0;
        dp[0] = 0;
        dp[1] = money[0];
        
        for(int i = 2;i<=money.length;i++){
            dp[i] = Math.max(dp[i-2]+money[i-1],dp[i-1]);
        }
        return dp[money.length];
    }

        //Recursion + Memoization
    //     int [] memo = new int [money.length];
    //     Arrays.fill(memo,-1);
    //     System.out.println(solve(money,0,memo));
    // }

    // private static int solve(int[] money,int i, int[] memo) {
    //     if(i>=money.length)
    //         return 0;
    //     if(memo[i]>=0)
    //         return memo[i];

    //     int steal = money[i] + solve(money, i+2,memo);
    //     int skip = solve(money, i+1,memo);
    //     return memo[i] = Math.max(steal, skip);
    // }
}
