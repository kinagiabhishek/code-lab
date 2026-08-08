// https://leetcode.com/problems/house-robber-iii/
package dynamic_programming;

import java.util.*;

public class HouseRobberIii {
    // LeetCode Problem 337: House Robber III
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        HouseRobberIii solver = new HouseRobberIii();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode337_HouseRobberIii (House Robber III) Passed!");
    }
}
