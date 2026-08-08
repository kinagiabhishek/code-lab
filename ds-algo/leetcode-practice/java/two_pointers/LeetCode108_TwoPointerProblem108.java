// https://leetcode.com/problems/problem-twopointer-108/
package two_pointers;

import java.util.*;

public class LeetCode108_TwoPointerProblem108 {
    public boolean solve(int[] nums, int target) {
        int l = 0, r = nums.length - 1;
        while (l < r) {
            int sum = nums[l] + nums[r];
            if (sum == target) return true;
            if (sum < target) l++; else r--;
        }
        return false;
    }
    public static void main(String[] args) {
        LeetCode108_TwoPointerProblem108 solver = new LeetCode108_TwoPointerProblem108();
        assert solver.solve(new int[]{1, 2, 4, 7}, 9) == true;
        System.out.println("✅ LeetCode108_TwoPointerProblem108 Passed!");
    }
}
