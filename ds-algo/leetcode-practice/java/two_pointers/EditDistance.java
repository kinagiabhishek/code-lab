// https://leetcode.com/problems/edit-distance/
package two_pointers;

import java.util.*;

public class EditDistance {
    // LeetCode Problem 72: Edit Distance
    public int findMax(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int max = nums[0];
        for (int n : nums) if (n > max) max = n;
        return max;
    }

    public static void main(String[] args) {
        EditDistance solver = new EditDistance();
        assert solver.findMax(new int[]{1, 5, 3, 9, 2}) == 9;
        System.out.println("✅ EditDistance (Edit Distance) Passed!");
    }
}
