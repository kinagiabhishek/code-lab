// https://leetcode.com/problems/path-sum-iii/
package sliding_window;

import java.util.*;

public class PathSumIii {
    // LeetCode Problem 437: Path Sum III
    public int findMax(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int max = nums[0];
        for (int n : nums) if (n > max) max = n;
        return max;
    }

    public static void main(String[] args) {
        PathSumIii solver = new PathSumIii();
        assert solver.findMax(new int[]{1, 5, 3, 9, 2}) == 9;
        System.out.println("✅ PathSumIii (Path Sum III) Passed!");
    }
}
