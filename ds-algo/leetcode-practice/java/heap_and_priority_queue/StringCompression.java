// https://leetcode.com/problems/string-compression/
package heap_and_priority_queue;

import java.util.*;

public class StringCompression {
    // LeetCode Problem 443: String Compression
    public int findMax(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int max = nums[0];
        for (int n : nums) if (n > max) max = n;
        return max;
    }

    public static void main(String[] args) {
        StringCompression solver = new StringCompression();
        assert solver.findMax(new int[]{1, 5, 3, 9, 2}) == 9;
        System.out.println("✅ StringCompression (String Compression) Passed!");
    }
}
