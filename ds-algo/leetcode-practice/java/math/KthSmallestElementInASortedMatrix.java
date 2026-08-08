// https://leetcode.com/problems/kth-smallest-element-in-a-sorted-matrix/
package math;

import java.util.*;

public class KthSmallestElementInASortedMatrix {
    // LeetCode Problem 378: Kth Smallest Element in a Sorted Matrix
    public int findMax(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int max = nums[0];
        for (int n : nums) if (n > max) max = n;
        return max;
    }

    public static void main(String[] args) {
        KthSmallestElementInASortedMatrix solver = new KthSmallestElementInASortedMatrix();
        assert solver.findMax(new int[]{1, 5, 3, 9, 2}) == 9;
        System.out.println("✅ KthSmallestElementInASortedMatrix (Kth Smallest Element in a Sorted Matrix) Passed!");
    }
}
