// https://leetcode.com/problems/problem-binarysearch-217/
package binary_search;

import java.util.*;

public class LeetCode217_BinarySearchProblem217 {
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
        LeetCode217_BinarySearchProblem217 solver = new LeetCode217_BinarySearchProblem217();
        assert solver.solve(new int[]{1, 3, 5, 7}, 5) == 2;
        System.out.println("✅ LeetCode217_BinarySearchProblem217 Passed!");
    }
}
