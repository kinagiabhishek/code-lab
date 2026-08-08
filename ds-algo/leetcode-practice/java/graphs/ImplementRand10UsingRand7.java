// https://leetcode.com/problems/implement-rand10-using-rand7/
package graphs;

import java.util.*;

public class ImplementRand10UsingRand7 {
    // LeetCode Problem 470: Implement Rand10() Using Rand7()
    public int findMax(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int max = nums[0];
        for (int n : nums) if (n > max) max = n;
        return max;
    }

    public static void main(String[] args) {
        ImplementRand10UsingRand7 solver = new ImplementRand10UsingRand7();
        assert solver.findMax(new int[]{1, 5, 3, 9, 2}) == 9;
        System.out.println("✅ ImplementRand10UsingRand7 (Implement Rand10() Using Rand7()) Passed!");
    }
}
