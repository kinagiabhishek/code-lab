// https://leetcode.com/problems/valid-sudoku/
package arrays_and_hashing;

import java.util.*;

public class ValidSudoku {
public boolean isValidSudoku(char[][] board) {
        Set<String> seen = new HashSet<>();
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                char c = board[i][j];
                if (c != '.') {
                    if (!seen.add(c + " in row " + i) || !seen.add(c + " in col " + j) || !seen.add(c + " in box " + i/3 + "-" + j/3))
                        return false;
                }
            }
        }
        return true;
    }
    public static void main(String[] args) {
        char[][] b = new char[9][9]; for(int i=0;i<9;i++) Arrays.fill(b[i],'.'); b[0][0]='5';
        ValidSudoku solver = new ValidSudoku();
        assert solver.isValidSudoku(b) == true;
        System.out.println("✅ ValidSudoku Passed!");
    }
}
