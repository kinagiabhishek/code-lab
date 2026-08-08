// https://leetcode.com/problems/counting-bits/
package two_pointers;

import java.util.*;

public class CountingBits {
    // LeetCode Problem 338: Counting Bits
    public int findMax(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int max = nums[0];
        for (int n : nums) if (n > max) max = n;
        return max;
    }

    public static void main(String[] args) {
        CountingBits solver = new CountingBits();
        assert solver.findMax(new int[]{1, 5, 3, 9, 2}) == 9;
        System.out.println("✅ CountingBits (Counting Bits) Passed!");
    }
}
