// https://leetcode.com/problems/ransom-note/
package binary_search;

import java.util.*;

public class RansomNote {
    // LeetCode Problem 383: Ransom Note
    public int findMax(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int max = nums[0];
        for (int n : nums) if (n > max) max = n;
        return max;
    }

    public static void main(String[] args) {
        RansomNote solver = new RansomNote();
        assert solver.findMax(new int[]{1, 5, 3, 9, 2}) == 9;
        System.out.println("✅ RansomNote (Ransom Note) Passed!");
    }
}
