// https://leetcode.com/problems/problem-binarysearch-226/
package binary_search;

import java.util.*;

public class LeetCode226_BinarySearchProblem226 {
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
        LeetCode226_BinarySearchProblem226 solver = new LeetCode226_BinarySearchProblem226();
        assert solver.solve(new int[]{1, 3, 5, 7}, 5) == 2;
        System.out.println("✅ LeetCode226_BinarySearchProblem226 Passed!");
    }
}
