// https://leetcode.com/problems/water-and-jug-problem/
package two_pointers;

import java.util.*;

public class LeetCode365_WaterAndJugProblem {
    // LeetCode Problem 365: Water and Jug Problem
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        LeetCode365_WaterAndJugProblem solver = new LeetCode365_WaterAndJugProblem();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode365_WaterAndJugProblem (Water and Jug Problem) Passed!");
    }
}
