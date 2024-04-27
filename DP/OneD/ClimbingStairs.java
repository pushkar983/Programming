package DP.OneD;

import java.util.HashMap;
import java.util.Scanner;

//ways to climb a stair = 1/2 Step at one time.

public class ClimbingStairs {
    public static void main(String[] args) {
        //main implementatiton - bottom up approach
        Scanner sc = new Scanner(System.in);
        System.out.print("enter no of stairs : ");
        int noOfStairs = sc.nextInt();
        System.out.println(ways(noOfStairs));
    }
        private static int ways(int noOfStairs) {
            int [] dp = new int[noOfStairs+1];
            dp[0] = 0;
            dp[1] = 1;
            dp[2] = 2;

            for(int i = 3;i<=noOfStairs;i++){
                dp[i] = dp[i-1]+dp[i-2];
            }
            return dp[noOfStairs];
        }
    }

    //memoization
    // {
    //     HashMap<Integer,Integer> memo = new HashMap<>();
    //     System.out.println(ways(noOfStairs,memo));
    // }

    // private static int ways(int noOfStairs,HashMap<Integer, Integer> memo) {
    //     if(noOfStairs==0 || noOfStairs==1) return 1;

    //     if(!memo.containsKey(noOfStairs)){
    //         memo.put(noOfStairs,ways(noOfStairs-1, memo)+ways(noOfStairs-2, memo));
    //     }
    //     return memo.get(noOfStairs);
    // }

    //     //bruteforce
    //     // Time Complexity = 2*n(noOfStairs) ex: for 3 = 8(nodes)
    //     int count = 0;
    //     System.out.println(ways(0,noOfStairs,count));
    // }
    // private static int ways(int steps, int noOfStairs,int count) {
    //     System.out.println(count);
    //     if(steps>noOfStairs)
    //         return count;
    //     if(steps==noOfStairs){
    //         System.out.println(steps+" : "+noOfStairs);
    //         count++;
    //         return count;
    //     }
    //     System.out.println(count);
    //     return ways(steps+1, noOfStairs,count)+ways(steps+2,noOfStairs,count);
