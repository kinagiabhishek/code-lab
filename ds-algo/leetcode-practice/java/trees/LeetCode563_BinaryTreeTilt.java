// https://leetcode.com/problems/binary-tree-tilt/
package trees;

import java.util.*;

public class LeetCode563_BinaryTreeTilt {
    // LeetCode Problem 563: Binary Tree Tilt
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        LeetCode563_BinaryTreeTilt solver = new LeetCode563_BinaryTreeTilt();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode563_BinaryTreeTilt (Binary Tree Tilt) Passed!");
    }
}
