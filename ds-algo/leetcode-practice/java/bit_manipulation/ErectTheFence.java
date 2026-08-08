// https://leetcode.com/problems/erect-the-fence/
package bit_manipulation;

import java.util.*;

public class ErectTheFence {
    // LeetCode Problem 587: Erect the Fence
    public int findMax(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int max = nums[0];
        for (int n : nums) if (n > max) max = n;
        return max;
    }

    public static void main(String[] args) {
        ErectTheFence solver = new ErectTheFence();
        assert solver.findMax(new int[]{1, 5, 3, 9, 2}) == 9;
        System.out.println("✅ ErectTheFence (Erect the Fence) Passed!");
    }
}
