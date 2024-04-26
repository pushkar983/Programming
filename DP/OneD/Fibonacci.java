package DP.OneD;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        //normal
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter fibonnaci to find : ");
        int n = sc.nextInt();
        System.out.println(fibonnaci(n));
    }

    private static int fibonnaci(int n) {
        if(n==0) return 0;
        if(n==1) return 1;
        return fibonnaci(n-1) + fibonnaci(n-2);
    }
}
