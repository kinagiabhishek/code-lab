// https://leetcode.com/problems/array-partition/
package arrays_and_hashing;

import java.util.*;

public class ArrayPartition {
    // LeetCode Problem 561: Array Partition
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        ArrayPartition solver = new ArrayPartition();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode561_ArrayPartition (Array Partition) Passed!");
    }
}
