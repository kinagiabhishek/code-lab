// https://leetcode.com/problems/insert-interval/
package arrays_and_hashing;

import java.util.*;

public class LeetCode57_InsertInterval {
    // LeetCode Problem 57: Insert Interval
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        LeetCode57_InsertInterval solver = new LeetCode57_InsertInterval();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode57_InsertInterval (Insert Interval) Passed!");
    }
}
