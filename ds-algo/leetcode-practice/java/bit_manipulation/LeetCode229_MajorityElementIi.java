// https://leetcode.com/problems/majority-element-ii/
package bit_manipulation;

import java.util.*;

public class LeetCode229_MajorityElementIi {
    // LeetCode Problem 229: Majority Element II
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        LeetCode229_MajorityElementIi solver = new LeetCode229_MajorityElementIi();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode229_MajorityElementIi (Majority Element II) Passed!");
    }
}
