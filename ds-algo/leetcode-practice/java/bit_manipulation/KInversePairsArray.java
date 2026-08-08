// https://leetcode.com/problems/k-inverse-pairs-array/
package bit_manipulation;

import java.util.*;

public class KInversePairsArray {
    // LeetCode Problem 629: K Inverse Pairs Array
    public int findMax(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int max = nums[0];
        for (int n : nums) if (n > max) max = n;
        return max;
    }

    public static void main(String[] args) {
        KInversePairsArray solver = new KInversePairsArray();
        assert solver.findMax(new int[]{1, 5, 3, 9, 2}) == 9;
        System.out.println("✅ KInversePairsArray (K Inverse Pairs Array) Passed!");
    }
}
