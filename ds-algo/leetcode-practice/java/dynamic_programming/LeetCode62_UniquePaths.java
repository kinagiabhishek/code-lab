// https://leetcode.com/problems/unique-paths/
package dynamic_programming;
import java.util.Arrays;
public class LeetCode62_UniquePaths {
    public int uniquePaths(int m, int n) {
        int[] row = new int[n];
        Arrays.fill(row, 1);
        for (int i = 0; i < m - 1; i++) {
            int[] newRow = new int[n];
            Arrays.fill(newRow, 1);
            for (int j = n - 2; j >= 0; j--) {
                newRow[j] = newRow[j + 1] + row[j];
            }
            row = newRow;
        }
        return row[0];
    }
    public static void main(String[] args) {
        assert new LeetCode62_UniquePaths().uniquePaths(3, 7) == 28;
        System.out.println("✅ LeetCode62_UniquePaths Passed!");
    }
}
