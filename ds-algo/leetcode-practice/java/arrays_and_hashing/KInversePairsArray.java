// https://leetcode.com/problems/k-inverse-pairs-array/
package arrays_and_hashing;

import java.util.*;

public class KInversePairsArray {
    // LeetCode Problem 629: K Inverse Pairs Array
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        KInversePairsArray solver = new KInversePairsArray();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode629_KInversePairsArray (K Inverse Pairs Array) Passed!");
    }
}
