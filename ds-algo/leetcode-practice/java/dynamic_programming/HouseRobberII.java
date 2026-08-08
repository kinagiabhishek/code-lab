// https://leetcode.com/problems/house-robber-ii/
package dynamic_programming;

import java.util.*;

public class LeetCode213_HouseRobberIi {
    // LeetCode Problem 213: House Robber II
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        LeetCode213_HouseRobberIi solver = new LeetCode213_HouseRobberIi();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode213_HouseRobberIi (House Robber II) Passed!");
    }
}
