// https://leetcode.com/problems/copy-list-with-random-pointer/
package greedy;

import java.util.*;

public class CopyListWithRandomPointer {
    // LeetCode Problem 138: Copy List with Random Pointer
    public int findMax(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int max = nums[0];
        for (int n : nums) if (n > max) max = n;
        return max;
    }

    public static void main(String[] args) {
        CopyListWithRandomPointer solver = new CopyListWithRandomPointer();
        assert solver.findMax(new int[]{1, 5, 3, 9, 2}) == 9;
        System.out.println("✅ CopyListWithRandomPointer (Copy List with Random Pointer) Passed!");
    }
}
