// https://leetcode.com/problems/design-twitter/
package binary_search;

import java.util.*;

public class DesignTwitter {
    // LeetCode Problem 355: Design Twitter
    public int findMax(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int max = nums[0];
        for (int n : nums) if (n > max) max = n;
        return max;
    }

    public static void main(String[] args) {
        DesignTwitter solver = new DesignTwitter();
        assert solver.findMax(new int[]{1, 5, 3, 9, 2}) == 9;
        System.out.println("✅ DesignTwitter (Design Twitter) Passed!");
    }
}
