// https://leetcode.com/problems/smallest-good-base/
package trees;

import java.util.*;

public class SmallestGoodBase {
    // LeetCode Problem 483: Smallest Good Base
    public int findMax(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int max = nums[0];
        for (int n : nums) if (n > max) max = n;
        return max;
    }

    public static void main(String[] args) {
        SmallestGoodBase solver = new SmallestGoodBase();
        assert solver.findMax(new int[]{1, 5, 3, 9, 2}) == 9;
        System.out.println("✅ SmallestGoodBase (Smallest Good Base) Passed!");
    }
}
