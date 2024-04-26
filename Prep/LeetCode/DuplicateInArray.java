package LeetCode;

public class DuplicateInArray {
    public static void main(String[] args) {
        // i - 1 -> N-1
        int [] arr = {1,2,3,3,4};
        for(int i = 0;i<arr.length;i++){
            if(arr[i] != i+1){
                System.out.println(arr[i]);
                break;
            }
        }
    }
}
