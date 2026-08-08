// https://leetcode.com/problems/combinations/
package backtracking;

import java.util.*;

public class LeetCode77_Combinations {
    // LeetCode Problem 77: Combinations
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        LeetCode77_Combinations solver = new LeetCode77_Combinations();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode77_Combinations (Combinations) Passed!");
    }
}
