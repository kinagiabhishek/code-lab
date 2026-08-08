// https://leetcode.com/problems/problem-binarysearch-213/
package binary_search;

import java.util.*;

public class LeetCode213_BinarySearchProblem213 {
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
        LeetCode213_BinarySearchProblem213 solver = new LeetCode213_BinarySearchProblem213();
        assert solver.solve(new int[]{1, 3, 5, 7}, 5) == 2;
        System.out.println("✅ LeetCode213_BinarySearchProblem213 Passed!");
    }
}
