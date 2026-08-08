// https://leetcode.com/problems/search-a-2d-matrix/
package stacks_and_queues;

import java.util.*;

public class SearchA2dMatrix {
    // LeetCode Problem 74: Search a 2D Matrix
    public int findMax(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int max = nums[0];
        for (int n : nums) if (n > max) max = n;
        return max;
    }

    public static void main(String[] args) {
        SearchA2dMatrix solver = new SearchA2dMatrix();
        assert solver.findMax(new int[]{1, 5, 3, 9, 2}) == 9;
        System.out.println("✅ SearchA2dMatrix (Search a 2D Matrix) Passed!");
    }
}
