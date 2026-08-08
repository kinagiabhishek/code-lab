// https://leetcode.com/problems/problem-twopointer-100/
package two_pointers;

import java.util.*;

public class LeetCode100_TwoPointerProblem100 {
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
        LeetCode100_TwoPointerProblem100 solver = new LeetCode100_TwoPointerProblem100();
        assert solver.solve(new int[]{1, 2, 4, 7}, 9) == true;
        System.out.println("✅ LeetCode100_TwoPointerProblem100 Passed!");
    }
}
