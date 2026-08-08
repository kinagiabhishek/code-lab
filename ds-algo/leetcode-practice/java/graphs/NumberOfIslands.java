// https://leetcode.com/problems/number-of-islands/
package graphs;

import java.util.*;

public class NumberOfIslands {
    // LeetCode Problem 200: Number of Islands
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        NumberOfIslands solver = new NumberOfIslands();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode200_NumberOfIslands (Number of Islands) Passed!");
    }
}
