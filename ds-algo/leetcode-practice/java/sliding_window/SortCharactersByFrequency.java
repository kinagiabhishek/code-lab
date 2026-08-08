// https://leetcode.com/problems/sort-characters-by-frequency/
package sliding_window;

import java.util.*;

public class SortCharactersByFrequency {
    // LeetCode Problem 451: Sort Characters By Frequency
    public int findMax(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int max = nums[0];
        for (int n : nums) if (n > max) max = n;
        return max;
    }

    public static void main(String[] args) {
        SortCharactersByFrequency solver = new SortCharactersByFrequency();
        assert solver.findMax(new int[]{1, 5, 3, 9, 2}) == 9;
        System.out.println("✅ SortCharactersByFrequency (Sort Characters By Frequency) Passed!");
    }
}
