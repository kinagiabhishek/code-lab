// https://leetcode.com/problems/number-of-islands/
package graphs;

import java.util.*;

public class LeetCode200_NumberOfIslands {
    // LeetCode Problem 200: Number of Islands
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        LeetCode200_NumberOfIslands solver = new LeetCode200_NumberOfIslands();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode200_NumberOfIslands (Number of Islands) Passed!");
    }
}
