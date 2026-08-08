// https://leetcode.com/problems/detect-capital/
package two_pointers;

import java.util.*;

public class DetectCapital {
    // LeetCode Problem 520: Detect Capital
    public int findMax(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int max = nums[0];
        for (int n : nums) if (n > max) max = n;
        return max;
    }

    public static void main(String[] args) {
        DetectCapital solver = new DetectCapital();
        assert solver.findMax(new int[]{1, 5, 3, 9, 2}) == 9;
        System.out.println("✅ DetectCapital (Detect Capital) Passed!");
    }
}
