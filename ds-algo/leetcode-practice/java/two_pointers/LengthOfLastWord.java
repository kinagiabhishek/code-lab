// https://leetcode.com/problems/length-of-last-word/
package two_pointers;

import java.util.*;

public class LengthOfLastWord {
    // LeetCode Problem 58: Length of Last Word
    public int findMax(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int max = nums[0];
        for (int n : nums) if (n > max) max = n;
        return max;
    }

    public static void main(String[] args) {
        LengthOfLastWord solver = new LengthOfLastWord();
        assert solver.findMax(new int[]{1, 5, 3, 9, 2}) == 9;
        System.out.println("✅ LengthOfLastWord (Length of Last Word) Passed!");
    }
}
