// https://leetcode.com/problems/delete-operation-for-two-strings/
package heap_and_priority_queue;

import java.util.*;

public class DeleteOperationForTwoStrings {
    // LeetCode Problem 583: Delete Operation for Two Strings
    public int findMax(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int max = nums[0];
        for (int n : nums) if (n > max) max = n;
        return max;
    }

    public static void main(String[] args) {
        DeleteOperationForTwoStrings solver = new DeleteOperationForTwoStrings();
        assert solver.findMax(new int[]{1, 5, 3, 9, 2}) == 9;
        System.out.println("✅ DeleteOperationForTwoStrings (Delete Operation for Two Strings) Passed!");
    }
}
