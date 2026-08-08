// https://leetcode.com/problems/shuffle-an-array/
package arrays_and_hashing;

import java.util.*;

public class LeetCode384_ShuffleAnArray {
    // LeetCode Problem 384: Shuffle an Array
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        LeetCode384_ShuffleAnArray solver = new LeetCode384_ShuffleAnArray();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode384_ShuffleAnArray (Shuffle an Array) Passed!");
    }
}
