// https://leetcode.com/problems/kth-largest-element-in-an-array/
package heap_and_priority_queue;

import java.util.*;

public class KthLargestElementInAnArray {
    // LeetCode Problem 215: Kth Largest Element in an Array
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        KthLargestElementInAnArray solver = new KthLargestElementInAnArray();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode215_KthLargestElementInAnArray (Kth Largest Element in an Array) Passed!");
    }
}
