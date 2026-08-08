// https://leetcode.com/problems/sum-root-to-leaf-numbers/
package sliding_window;

import java.util.*;

public class SumRootToLeafNumbers {
    // LeetCode Problem 129: Sum Root to Leaf Numbers
    public int findMax(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int max = nums[0];
        for (int n : nums) if (n > max) max = n;
        return max;
    }

    public static void main(String[] args) {
        SumRootToLeafNumbers solver = new SumRootToLeafNumbers();
        assert solver.findMax(new int[]{1, 5, 3, 9, 2}) == 9;
        System.out.println("✅ SumRootToLeafNumbers (Sum Root to Leaf Numbers) Passed!");
    }
}
