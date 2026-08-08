// https://leetcode.com/problems/problem-binarysearch-238/
package binary_search;

import java.util.*;

public class LeetCode238_BinarySearchProblem238 {
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
        LeetCode238_BinarySearchProblem238 solver = new LeetCode238_BinarySearchProblem238();
        assert solver.solve(new int[]{1, 3, 5, 7}, 5) == 2;
        System.out.println("✅ LeetCode238_BinarySearchProblem238 Passed!");
    }
}
