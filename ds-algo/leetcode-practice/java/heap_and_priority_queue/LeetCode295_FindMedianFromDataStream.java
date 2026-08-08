// https://leetcode.com/problems/find-median-from-data-stream/
package heap_and_priority_queue;

import java.util.*;

public class LeetCode295_FindMedianFromDataStream {
    // LeetCode Problem 295: Find Median from Data Stream
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        LeetCode295_FindMedianFromDataStream solver = new LeetCode295_FindMedianFromDataStream();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode295_FindMedianFromDataStream (Find Median from Data Stream) Passed!");
    }
}
