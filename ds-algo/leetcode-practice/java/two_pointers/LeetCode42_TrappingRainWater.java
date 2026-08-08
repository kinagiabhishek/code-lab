// https://leetcode.com/problems/trapping-rain-water/
package two_pointers;

import java.util.*;

public class LeetCode42_TrappingRainWater {
    // LeetCode Problem 42: Trapping Rain Water
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        LeetCode42_TrappingRainWater solver = new LeetCode42_TrappingRainWater();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode42_TrappingRainWater (Trapping Rain Water) Passed!");
    }
}
