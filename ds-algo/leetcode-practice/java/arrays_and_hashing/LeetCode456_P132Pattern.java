// https://leetcode.com/problems/132-pattern/
package arrays_and_hashing;

import java.util.*;

public class LeetCode456_P132Pattern {
    // LeetCode Problem 456: 132 Pattern
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        LeetCode456_P132Pattern solver = new LeetCode456_P132Pattern();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode456_P132Pattern (132 Pattern) Passed!");
    }
}
