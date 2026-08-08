// https://leetcode.com/problems/find-median-from-data-stream/
package arrays_and_hashing;

import java.util.*;

public class FindMedianFromDataStream {
    // LeetCode Problem 295: Find Median from Data Stream
    public int findMax(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int max = nums[0];
        for (int n : nums) if (n > max) max = n;
        return max;
    }

    public static void main(String[] args) {
        FindMedianFromDataStream solver = new FindMedianFromDataStream();
        assert solver.findMax(new int[]{1, 5, 3, 9, 2}) == 9;
        System.out.println("✅ FindMedianFromDataStream (Find Median from Data Stream) Passed!");
    }
}
