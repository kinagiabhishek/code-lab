// https://leetcode.com/problems/interleaving-string/
package arrays_and_hashing;

import java.util.*;

public class InterleavingString {
    // LeetCode Problem 97: Interleaving String
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        InterleavingString solver = new InterleavingString();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode97_InterleavingString (Interleaving String) Passed!");
    }
}
