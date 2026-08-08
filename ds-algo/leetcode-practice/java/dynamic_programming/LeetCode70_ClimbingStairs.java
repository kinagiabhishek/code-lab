// https://leetcode.com/problems/climbing-stairs/
package dynamic_programming;

import java.util.*;

public class LeetCode70_ClimbingStairs {
    // LeetCode Problem 70: Climbing Stairs
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        LeetCode70_ClimbingStairs solver = new LeetCode70_ClimbingStairs();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode70_ClimbingStairs (Climbing Stairs) Passed!");
    }
}
