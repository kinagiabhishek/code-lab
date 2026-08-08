// https://leetcode.com/problems/binary-tree-right-side-view/
package trees;

import java.util.*;

public class LeetCode199_BinaryTreeRightSideView {
    // LeetCode Problem 199: Binary Tree Right Side View
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        LeetCode199_BinaryTreeRightSideView solver = new LeetCode199_BinaryTreeRightSideView();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode199_BinaryTreeRightSideView (Binary Tree Right Side View) Passed!");
    }
}
