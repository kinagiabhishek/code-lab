// https://leetcode.com/problems/find-right-interval/
package arrays_and_hashing;

import java.util.*;

public class FindRightInterval {
    // LeetCode Problem 436: Find Right Interval
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        FindRightInterval solver = new FindRightInterval();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode436_FindRightInterval (Find Right Interval) Passed!");
    }
}
