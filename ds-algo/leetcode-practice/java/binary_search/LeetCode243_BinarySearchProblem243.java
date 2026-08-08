// https://leetcode.com/problems/problem-binarysearch-243/
package binary_search;

import java.util.*;

public class LeetCode243_BinarySearchProblem243 {
    public int solve(int[] nums, int target) {
        int l = 0, r = nums.length - 1;
        while (l <= r) {
            int mid = l + (r - l)/2;
            if (nums[mid] == target) return mid;
            if (nums[mid] < target) l = mid + 1; else r = mid - 1;
        }
        return -1;
    }
    public static void main(String[] args) {
        LeetCode243_BinarySearchProblem243 solver = new LeetCode243_BinarySearchProblem243();
        assert solver.solve(new int[]{1, 3, 5, 7}, 5) == 2;
        System.out.println("✅ LeetCode243_BinarySearchProblem243 Passed!");
    }
}
