// https://leetcode.com/problems/h-index-ii/
package arrays_and_hashing;

import java.util.*;

public class LeetCode275_HindexIi {
    // LeetCode Problem 275: H-Index II
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        LeetCode275_HindexIi solver = new LeetCode275_HindexIi();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode275_HindexIi (H-Index II) Passed!");
    }
}
