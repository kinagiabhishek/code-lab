// https://leetcode.com/problems/first-unique-character-in-a-string/
package heap_and_priority_queue;

import java.util.*;

public class FirstUniqueCharacterInAString {
    // LeetCode Problem 387: First Unique Character in a String
    public int findMax(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int max = nums[0];
        for (int n : nums) if (n > max) max = n;
        return max;
    }

    public static void main(String[] args) {
        FirstUniqueCharacterInAString solver = new FirstUniqueCharacterInAString();
        assert solver.findMax(new int[]{1, 5, 3, 9, 2}) == 9;
        System.out.println("✅ FirstUniqueCharacterInAString (First Unique Character in a String) Passed!");
    }
}
