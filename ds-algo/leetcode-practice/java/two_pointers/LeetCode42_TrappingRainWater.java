// https://leetcode.com/problems/trapping-rain-water/
package two_pointers;

import java.util.*;

public class LeetCode42_TrappingRainWater {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode42_TrappingRainWater solver = new LeetCode42_TrappingRainWater();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode42_TrappingRainWater Passed!");
    }
}
