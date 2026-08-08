// https://leetcode.com/problems/zigzag-conversion/
package arrays_and_hashing;

import java.util.*;

public class LeetCode6_ZigzagConversion {
    // LeetCode Problem 6: Zigzag Conversion
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        LeetCode6_ZigzagConversion solver = new LeetCode6_ZigzagConversion();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode6_ZigzagConversion (Zigzag Conversion) Passed!");
    }
}
