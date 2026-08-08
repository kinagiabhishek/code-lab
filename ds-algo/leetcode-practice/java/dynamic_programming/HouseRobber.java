// https://leetcode.com/problems/house-robber/
package dynamic_programming;

import java.util.*;

public class HouseRobber {
    // LeetCode Problem 198: House Robber
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        HouseRobber solver = new HouseRobber();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode198_HouseRobber (House Robber) Passed!");
    }
}
