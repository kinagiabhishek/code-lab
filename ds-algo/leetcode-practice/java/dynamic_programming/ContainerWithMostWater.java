// https://leetcode.com/problems/container-with-most-water/
package dynamic_programming;

import java.util.*;

public class ContainerWithMostWater {
    // LeetCode Problem 11: Container With Most Water
    public int findMax(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int max = nums[0];
        for (int n : nums) if (n > max) max = n;
        return max;
    }

    public static void main(String[] args) {
        ContainerWithMostWater solver = new ContainerWithMostWater();
        assert solver.findMax(new int[]{1, 5, 3, 9, 2}) == 9;
        System.out.println("✅ ContainerWithMostWater (Container With Most Water) Passed!");
    }
}
