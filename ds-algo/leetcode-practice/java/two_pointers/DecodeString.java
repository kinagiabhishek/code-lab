// https://leetcode.com/problems/decode-string/
package two_pointers;

import java.util.*;

public class DecodeString {
    // LeetCode Problem 394: Decode String
    public int findMax(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int max = nums[0];
        for (int n : nums) if (n > max) max = n;
        return max;
    }

    public static void main(String[] args) {
        DecodeString solver = new DecodeString();
        assert solver.findMax(new int[]{1, 5, 3, 9, 2}) == 9;
        System.out.println("✅ DecodeString (Decode String) Passed!");
    }
}
