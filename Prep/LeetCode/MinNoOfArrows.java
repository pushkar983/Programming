package LeetCode;

import java.util.Arrays;

public class MinNoOfArrows {
    public static void main(String[] args) {

        int[][] points = new int[][]{{10,16},{2,8},{1,6},{7,12}};
        System.out.println(findMinArrowShots(points));   
    }

    private static int findMinArrowShots(int[][] points) {
        if(points.length==0)
            return 0;
        Arrays.sort(points,(a,b)->Integer.compare(a[1], b[1]));
        
        int start = points[0][1];
        int count = 1;

        for(int i = 1;i<points.length;i++){
            if(points[i][0]>start){
                count++;
                start = points[i][1];
            }
        }
        return count;
    }
}
