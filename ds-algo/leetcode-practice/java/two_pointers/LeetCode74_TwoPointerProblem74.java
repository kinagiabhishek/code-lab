// https://leetcode.com/problems/problem-twopointer-74/
package two_pointers;

import java.util.*;

public class LeetCode74_TwoPointerProblem74 {
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
        LeetCode74_TwoPointerProblem74 solver = new LeetCode74_TwoPointerProblem74();
        assert solver.solve(new int[]{1, 2, 4, 7}, 9) == true;
        System.out.println("✅ LeetCode74_TwoPointerProblem74 Passed!");
    }
}
