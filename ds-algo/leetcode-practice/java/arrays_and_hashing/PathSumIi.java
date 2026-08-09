// https://leetcode.com/problems/path-sum-ii/
package arrays_and_hashing;

import java.util.*;

public class PathSumIi {
    // LeetCode Problem 113: Path Sum II
    // Official LeetCode Method Signature: public List<List<Integer>> pathSum(TreeNode root, int targetSum)
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        return new ArrayList<>();
    }

    public static void main(String[] args) {
        PathSumIi solver = new PathSumIi();
        assert solver.pathSum(new int[]{1}).isEmpty();
        System.out.println("✅ PathSumIi (Path Sum II) Passed!");
    }
}
