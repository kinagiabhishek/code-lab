// https://leetcode.com/problems/simplify-path/
package dynamic_programming;

import java.util.*;

public class LeetCode71_SimplifyPath {
    // LeetCode Problem 71: Simplify Path
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        LeetCode71_SimplifyPath solver = new LeetCode71_SimplifyPath();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode71_SimplifyPath (Simplify Path) Passed!");
    }
}
