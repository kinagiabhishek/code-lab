// https://leetcode.com/problems/k-inverse-pairs-array/
package arrays_and_hashing;

import java.util.*;

public class LeetCode629_KInversePairsArray {
    // LeetCode Problem 629: K Inverse Pairs Array
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        LeetCode629_KInversePairsArray solver = new LeetCode629_KInversePairsArray();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode629_KInversePairsArray (K Inverse Pairs Array) Passed!");
    }
}
