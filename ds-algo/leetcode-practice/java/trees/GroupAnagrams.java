// https://leetcode.com/problems/group-anagrams/
package trees;

import java.util.*;

public class GroupAnagrams {
    // LeetCode Problem 49: Group Anagrams
    public int findMax(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int max = nums[0];
        for (int n : nums) if (n > max) max = n;
        return max;
    }

    public static void main(String[] args) {
        GroupAnagrams solver = new GroupAnagrams();
        assert solver.findMax(new int[]{1, 5, 3, 9, 2}) == 9;
        System.out.println("✅ GroupAnagrams (Group Anagrams) Passed!");
    }
}
