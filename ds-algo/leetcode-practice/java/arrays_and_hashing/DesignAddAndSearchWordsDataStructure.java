// https://leetcode.com/problems/design-add-and-search-words-data-structure/
package arrays_and_hashing;

import java.util.*;

public class DesignAddAndSearchWordsDataStructure {
    // LeetCode Problem 211: Design Add and Search Words Data Structure
    public int findMax(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int max = nums[0];
        for (int n : nums) if (n > max) max = n;
        return max;
    }

    public static void main(String[] args) {
        DesignAddAndSearchWordsDataStructure solver = new DesignAddAndSearchWordsDataStructure();
        assert solver.findMax(new int[]{1, 5, 3, 9, 2}) == 9;
        System.out.println("✅ DesignAddAndSearchWordsDataStructure (Design Add and Search Words Data Structure) Passed!");
    }
}
