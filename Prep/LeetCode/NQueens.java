package LeetCode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class NQueens {
    static List<List<String>> res = new ArrayList<>();
    static int N;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        N = n;
        System.out.println(solveNQueens(n));
    }

    private static List<List<String>> solveNQueens(int n) {
        List<List<String>> state = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            List<String> list = new ArrayList<>();
            for (int j = 0; j < n; j++)
                list.add(".");
            state.add(list);
        }

        solve(state,0,new HashSet<>(),new HashSet<>(),new HashSet<>());
        return res;
    }

    public static void solve(List<List<String>> state, int row, Set<Integer> colSet,Set<Integer> diagSet, Set<Integer> antiDiagSet) {
        if (row == state.size()) {
            for(List<String> innerList : state){
                List<String> temp = new ArrayList<>();
                temp.add(String.join("", innerList));
                res.add(temp);
            }
            return;
        }

        for(int col = 0;col<N;col++){
            int currDiag = row+col; 
            int antiDiag = row-col;

            if(colSet.contains(col) || diagSet.contains(currDiag) || antiDiagSet.contains(antiDiag)){
                continue;
            }

            colSet.add(col);
            diagSet.add(currDiag);
            antiDiagSet.add(antiDiag);
            state.get(row).set(col, "Q");

            solve(state,row+1,colSet,diagSet,antiDiagSet);

            colSet.remove(col);
            diagSet.remove(currDiag);
            antiDiagSet.remove(antiDiag);

            state.get(row).set(col, ".");
        }
    }
}
