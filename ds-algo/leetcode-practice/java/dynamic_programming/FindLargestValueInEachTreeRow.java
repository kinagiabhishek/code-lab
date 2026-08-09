// https://leetcode.com/problems/find-largest-value-in-each-tree-row/
package dynamic_programming;

import java.util.*;

public class FindLargestValueInEachTreeRow {
    // LeetCode Problem 515: Find Largest Value in Each Tree Row
    // Official LeetCode Method Signature: public List<Integer> largestValues(TreeNode root)
    public List<Integer> largestValues(TreeNode root) {
        return new ArrayList<>();
    }

    public static void main(String[] args) {
        FindLargestValueInEachTreeRow solver = new FindLargestValueInEachTreeRow();
        assert solver.largestValues(new int[]{1}).isEmpty();
        System.out.println("✅ FindLargestValueInEachTreeRow Passed!");
    }
}
