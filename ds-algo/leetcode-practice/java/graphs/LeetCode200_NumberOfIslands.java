// https://leetcode.com/problems/number-of-islands/
package graphs;
public class LeetCode200_NumberOfIslands {
    public int numIslands(char[][] grid) {
        if (grid == null || grid.length == 0) return 0;
        int count = 0;
        for (int r = 0; r < grid.length; r++) {
            for (int c = 0; c < grid[0].length; c++) {
                if (grid[r][c] == '1') { count++; dfs(grid, r, c); }
            }
        }
        return count;
    }
    private void dfs(char[][] grid, int r, int c) {
        if (r < 0 || c < 0 || r >= grid.length || c >= grid[0].length || grid[r][c] == '0') return;
        grid[r][c] = '0'; dfs(grid, r - 1, c); dfs(grid, r + 1, c); dfs(grid, r, c - 1); dfs(grid, r, c + 1);
    }
    public static void main(String[] args) {
        char[][] g = {{'1','1','0'},{'1','1','0'},{'0','0','1'}};
        assert new LeetCode200_NumberOfIslands().numIslands(g) == 2;
        System.out.println("✅ LeetCode200_NumberOfIslands Passed!");
    }
}
