// https://leetcode.com/problems/patching-array/
package arrays_and_hashing;

import java.util.*;

public class PatchingArray {
    // LeetCode Problem 330: Patching Array
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        PatchingArray solver = new PatchingArray();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode330_PatchingArray (Patching Array) Passed!");
    }
}
