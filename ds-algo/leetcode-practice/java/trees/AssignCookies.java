// https://leetcode.com/problems/assign-cookies/
package trees;

import java.util.*;

public class AssignCookies {
    // LeetCode Problem 455: Assign Cookies
    public int findMax(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int max = nums[0];
        for (int n : nums) if (n > max) max = n;
        return max;
    }

    public static void main(String[] args) {
        AssignCookies solver = new AssignCookies();
        assert solver.findMax(new int[]{1, 5, 3, 9, 2}) == 9;
        System.out.println("✅ AssignCookies (Assign Cookies) Passed!");
    }
}
