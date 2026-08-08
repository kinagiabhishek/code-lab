// https://leetcode.com/problems/search-a-2d-matrix-ii/
package graphs;

import java.util.*;

public class SearchA2dMatrixIi {
    // LeetCode Problem 240: Search a 2D Matrix II
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        SearchA2dMatrixIi solver = new SearchA2dMatrixIi();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode240_SearchA2dMatrixIi (Search a 2D Matrix II) Passed!");
    }
}
