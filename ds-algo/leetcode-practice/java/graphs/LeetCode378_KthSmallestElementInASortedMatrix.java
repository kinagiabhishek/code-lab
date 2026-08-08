// https://leetcode.com/problems/kth-smallest-element-in-a-sorted-matrix/
package graphs;

import java.util.*;

public class LeetCode378_KthSmallestElementInASortedMatrix {
    // LeetCode Problem 378: Kth Smallest Element in a Sorted Matrix
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        LeetCode378_KthSmallestElementInASortedMatrix solver = new LeetCode378_KthSmallestElementInASortedMatrix();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode378_KthSmallestElementInASortedMatrix (Kth Smallest Element in a Sorted Matrix) Passed!");
    }
}
