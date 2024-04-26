package LeetCode;

import java.time.LocalDateTime;
import java.util.HashMap;

public class MaxFrequencies {
    public static void main(String[] args) {
        int [] nums = {1,2,2,3,1,4};
        HashMap<Integer,Integer> map = new HashMap<>();
        int max = -1;
        for(int i : nums){
            map.put(i, map.getOrDefault(i, 0)+1);
            max = Math.max(map.get(i), max);
        }
        
        for(int i : map.values()){
            if(i == max){
                max+=max;
            }
        } 
        System.out.println(LocalDateTime.now());
        System.out.println(max);
    }
}
