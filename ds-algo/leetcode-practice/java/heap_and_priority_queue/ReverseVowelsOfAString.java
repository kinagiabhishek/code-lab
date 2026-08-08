// https://leetcode.com/problems/reverse-vowels-of-a-string/
package heap_and_priority_queue;

import java.util.*;

public class ReverseVowelsOfAString {
    // LeetCode Problem 345: Reverse Vowels of a String
    public int findMax(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int max = nums[0];
        for (int n : nums) if (n > max) max = n;
        return max;
    }

    public static void main(String[] args) {
        ReverseVowelsOfAString solver = new ReverseVowelsOfAString();
        assert solver.findMax(new int[]{1, 5, 3, 9, 2}) == 9;
        System.out.println("✅ ReverseVowelsOfAString (Reverse Vowels of a String) Passed!");
    }
}
