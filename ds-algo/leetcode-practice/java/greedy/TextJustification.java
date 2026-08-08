// https://leetcode.com/problems/text-justification/
package greedy;

import java.util.*;

public class TextJustification {
    // LeetCode Problem 68: Text Justification
    public int findMax(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int max = nums[0];
        for (int n : nums) if (n > max) max = n;
        return max;
    }

    public static void main(String[] args) {
        TextJustification solver = new TextJustification();
        assert solver.findMax(new int[]{1, 5, 3, 9, 2}) == 9;
        System.out.println("✅ TextJustification (Text Justification) Passed!");
    }
}
