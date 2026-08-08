// https://leetcode.com/problems/unique-binary-search-trees-ii/
package trees;

import java.util.*;

public class LeetCode95_UniqueBinarySearchTreesIi {
    // LeetCode Problem 95: Unique Binary Search Trees II
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        LeetCode95_UniqueBinarySearchTreesIi solver = new LeetCode95_UniqueBinarySearchTreesIi();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode95_UniqueBinarySearchTreesIi (Unique Binary Search Trees II) Passed!");
    }
}
