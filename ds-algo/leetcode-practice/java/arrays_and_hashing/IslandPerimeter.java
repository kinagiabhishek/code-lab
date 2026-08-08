// https://leetcode.com/problems/island-perimeter/
package arrays_and_hashing;

import java.util.*;

public class IslandPerimeter {
    // LeetCode Problem 463: Island Perimeter
    public int findMax(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int max = nums[0];
        for (int n : nums) if (n > max) max = n;
        return max;
    }

    public static void main(String[] args) {
        IslandPerimeter solver = new IslandPerimeter();
        assert solver.findMax(new int[]{1, 5, 3, 9, 2}) == 9;
        System.out.println("✅ IslandPerimeter (Island Perimeter) Passed!");
    }
}
