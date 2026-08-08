/**
 * LeetCode 200: Number of Islands
 * Link: https://leetcode.com/problems/number-of-islands/
 * Difficulty: Medium
 */

#include <iostream>
#include <vector>
#include <cassert>

using namespace std;

class Solution {
private:
    void dfs(vector<vector<char>>& grid, int r, int c) {
        int nr = grid.size();
        int nc = grid[0].size();
        if (r < 0 || c < 0 || r >= nr || c >= nc || grid[r][c] == '0') return;
        grid[r][c] = '0';
        dfs(grid, r - 1, c);
        dfs(grid, r + 1, c);
        dfs(grid, r, c - 1);
        dfs(grid, r, c + 1);
    }
public:
    int numIslands(vector<vector<char>>& grid) {
        if (grid.empty()) return 0;
        int count = 0;
        for (int r = 0; r < grid.size(); r++) {
            for (int c = 0; c < grid[0].size(); c++) {
                if (grid[r][c] == '1') {
                    count++;
                    dfs(grid, r, c);
                }
            }
        }
        return count;
    }
};

int main() {
    Solution sol;
    vector<vector<char>> grid = {
        {'1','1','1','1','0'},
        {'1','1','0','1','0'},
        {'1','1','0','0','0'},
        {'0','0','0','0','0'}
    };
    assert(sol.numIslands(grid) == 1);
    cout << "Test NumberOfIslands Passed!" << endl;
    return 0;
}
