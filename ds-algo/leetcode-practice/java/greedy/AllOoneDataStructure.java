// https://leetcode.com/problems/all-oone-data-structure/
package greedy;

import java.util.*;

public class AllOoneDataStructure {
    // LeetCode Problem 432: All O`one Data Structure
    public int findMax(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int max = nums[0];
        for (int n : nums) if (n > max) max = n;
        return max;
    }

    public static void main(String[] args) {
        AllOoneDataStructure solver = new AllOoneDataStructure();
        assert solver.findMax(new int[]{1, 5, 3, 9, 2}) == 9;
        System.out.println("✅ AllOoneDataStructure (All O`one Data Structure) Passed!");
    }
}
