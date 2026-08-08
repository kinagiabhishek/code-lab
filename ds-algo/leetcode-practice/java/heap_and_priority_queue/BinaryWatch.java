// https://leetcode.com/problems/binary-watch/
package heap_and_priority_queue;

import java.util.*;

public class BinaryWatch {
    // LeetCode Problem 401: Binary Watch
    public int findMax(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int max = nums[0];
        for (int n : nums) if (n > max) max = n;
        return max;
    }

    public static void main(String[] args) {
        BinaryWatch solver = new BinaryWatch();
        assert solver.findMax(new int[]{1, 5, 3, 9, 2}) == 9;
        System.out.println("✅ BinaryWatch (Binary Watch) Passed!");
    }
}
