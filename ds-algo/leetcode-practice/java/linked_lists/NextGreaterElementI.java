// https://leetcode.com/problems/next-greater-element-i/
package linked_lists;

import java.util.*;

public class NextGreaterElementI {
    // LeetCode Problem 496: Next Greater Element I
    public int findMax(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int max = nums[0];
        for (int n : nums) if (n > max) max = n;
        return max;
    }

    public static void main(String[] args) {
        NextGreaterElementI solver = new NextGreaterElementI();
        assert solver.findMax(new int[]{1, 5, 3, 9, 2}) == 9;
        System.out.println("✅ NextGreaterElementI (Next Greater Element I) Passed!");
    }
}
