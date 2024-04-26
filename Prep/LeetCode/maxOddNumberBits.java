package LeetCode;
import java.io.BufferedReader;
import java.util.Scanner;

public class maxOddNumberBits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter String to convert to max odd number");
        String s = scanner.nextLine();
        System.out.println(maxOddNumber(s));
    }

    private static String maxOddNumber(String s) {
        StringBuilder res = new StringBuilder();
        int countOnes = countFreq(s,'1');
        int countZeros = s.length()-countOnes;
        while(countOnes-- > 1)
            res.append('1');
        while (countZeros-- > 0)
            res.append('0');
        res.append('1');
        return res.toString();    
    }

    private static int countFreq(String res,char pat) {
        int count = 0;
        for(char ch : res.toCharArray()){
            if(ch == pat)
                count++;
        }
        return count;
    }
}