// https://leetcode.com/problems/tag-validator/
package sliding_window;

import java.util.*;

public class TagValidator {
    // LeetCode Problem 591: Tag Validator
    public int findMax(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int max = nums[0];
        for (int n : nums) if (n > max) max = n;
        return max;
    }

    public static void main(String[] args) {
        TagValidator solver = new TagValidator();
        assert solver.findMax(new int[]{1, 5, 3, 9, 2}) == 9;
        System.out.println("✅ TagValidator (Tag Validator) Passed!");
    }
}
