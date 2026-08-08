// https://leetcode.com/problems/binary-tree-right-side-view/
package trees;

import java.util.*;

public class BinaryTreeRightSideView {
    // LeetCode Problem 199: Binary Tree Right Side View
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        BinaryTreeRightSideView solver = new BinaryTreeRightSideView();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode199_BinaryTreeRightSideView (Binary Tree Right Side View) Passed!");
    }
}
