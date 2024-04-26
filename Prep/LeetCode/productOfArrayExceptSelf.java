package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * productOfArrayExceptSelf
 */
public class productOfArrayExceptSelf {
    public static void main(String[] args) {
        int [] nums = {9,0,-2};
        int [] arr = new int[nums.length];
        int pSum = 1;
        for(int i = 0;i<nums.length;i++){
            arr[i] = pSum;
            pSum*=nums[i];
        }
        pSum=1;
        for(int i = nums.length-1;i>=0;i--){
            arr[i]*=pSum;
            pSum*=nums[i];
        }
        System.out.println(Arrays.toString(arr));
    }
}