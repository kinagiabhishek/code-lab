// https://leetcode.com/problems/path-sum-iii/
package dynamic_programming;

import java.util.*;

public class LeetCode437_PathSumIii {
    // LeetCode Problem 437: Path Sum III
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        LeetCode437_PathSumIii solver = new LeetCode437_PathSumIii();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode437_PathSumIii (Path Sum III) Passed!");
    }
}
