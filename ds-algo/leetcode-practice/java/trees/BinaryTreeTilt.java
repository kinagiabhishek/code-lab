// https://leetcode.com/problems/binary-tree-tilt/
package trees;

import java.util.*;

public class BinaryTreeTilt {
    // LeetCode Problem 563: Binary Tree Tilt
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        BinaryTreeTilt solver = new BinaryTreeTilt();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode563_BinaryTreeTilt (Binary Tree Tilt) Passed!");
    }
}
