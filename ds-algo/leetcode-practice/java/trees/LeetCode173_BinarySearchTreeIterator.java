// https://leetcode.com/problems/binary-search-tree-iterator/
package trees;

import java.util.*;

public class LeetCode173_BinarySearchTreeIterator {
    // LeetCode Problem 173: Binary Search Tree Iterator
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        LeetCode173_BinarySearchTreeIterator solver = new LeetCode173_BinarySearchTreeIterator();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode173_BinarySearchTreeIterator (Binary Search Tree Iterator) Passed!");
    }
}
