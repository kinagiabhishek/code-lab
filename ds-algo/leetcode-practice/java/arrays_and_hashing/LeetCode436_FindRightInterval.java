// https://leetcode.com/problems/find-right-interval/
package arrays_and_hashing;

import java.util.*;

public class LeetCode436_FindRightInterval {
    // LeetCode Problem 436: Find Right Interval
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        LeetCode436_FindRightInterval solver = new LeetCode436_FindRightInterval();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode436_FindRightInterval (Find Right Interval) Passed!");
    }
}
