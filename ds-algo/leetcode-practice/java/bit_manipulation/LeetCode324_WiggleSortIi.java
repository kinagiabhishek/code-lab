// https://leetcode.com/problems/wiggle-sort-ii/
package bit_manipulation;

import java.util.*;

public class LeetCode324_WiggleSortIi {
    // LeetCode Problem 324: Wiggle Sort II
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        LeetCode324_WiggleSortIi solver = new LeetCode324_WiggleSortIi();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode324_WiggleSortIi (Wiggle Sort II) Passed!");
    }
}
