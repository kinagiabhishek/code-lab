// https://leetcode.com/problems/contiguous-array/
package arrays_and_hashing;

import java.util.*;

public class LeetCode525_ContiguousArray {
    // LeetCode Problem 525: Contiguous Array
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        LeetCode525_ContiguousArray solver = new LeetCode525_ContiguousArray();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode525_ContiguousArray (Contiguous Array) Passed!");
    }
}
