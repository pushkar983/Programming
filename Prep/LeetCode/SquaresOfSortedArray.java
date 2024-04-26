package LeetCode;

import java.sql.Array;
import java.util.Arrays;

public class SquaresOfSortedArray {
    public static void main(String[] args) {
        int [] nums = {-4,-1,0,3,10};
        int []ans = new int[nums.length]; 
        int i = 0;
        int j = nums.length-1;
        for(int k = nums.length-1;k>0;k--){
            if(Math.abs(nums[j])>Math.abs(nums[i])){
                ans[k] = nums[j]*nums[j];
                j--;
            }else{
                ans[k] = nums[i]*nums[i];
                i++;
            }
        }
        System.out.println(Arrays.toString(ans));
    }
}
