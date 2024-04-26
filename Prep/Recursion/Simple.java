package Recursion;

public class Simple {
    public static void main(String[] args) {
        int n = 54321;
        System.out.println(sumDigit(n,0));
        System.out.println(productdigit(n));
        System.out.println(reverse(n,0));
        int digits = (int)Math.log10(n)+1;
        System.out.println(digits);
    }

    private static int reverse(int n,int num) {
        if(n==0)
            return num;
        num = num*10+n%10;
        return reverse(n/10, num);
    }
    private static int productdigit(int n) {
        if(n==0)
            return 1;
        return n%10*productdigit(n/10);
    }

    private static int sumDigit(int n,int sum) {
        if(n==0) return sum;
        return sum=n%10+sumDigit(n/10, sum);
    }

    private static int factorial(int n) {
        if(n==1) return n;
        return n*factorial(n-1);
        
    }
}
