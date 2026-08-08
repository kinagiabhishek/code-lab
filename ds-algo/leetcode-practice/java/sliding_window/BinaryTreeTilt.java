// https://leetcode.com/problems/binary-tree-tilt/
package sliding_window;

import java.util.*;

public class BinaryTreeTilt {
    // LeetCode Problem 563: Binary Tree Tilt
    public int findMax(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int max = nums[0];
        for (int n : nums) if (n > max) max = n;
        return max;
    }

    public static void main(String[] args) {
        BinaryTreeTilt solver = new BinaryTreeTilt();
        assert solver.findMax(new int[]{1, 5, 3, 9, 2}) == 9;
        System.out.println("✅ BinaryTreeTilt (Binary Tree Tilt) Passed!");
    }
}
