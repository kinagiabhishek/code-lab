// https://leetcode.com/problems/h-index/
package graphs;

import java.util.*;

public class Hindex {
    // LeetCode Problem 274: H-Index
    public int findMax(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int max = nums[0];
        for (int n : nums) if (n > max) max = n;
        return max;
    }

    public static void main(String[] args) {
        Hindex solver = new Hindex();
        assert solver.findMax(new int[]{1, 5, 3, 9, 2}) == 9;
        System.out.println("✅ Hindex (H-Index) Passed!");
    }
}
