// https://leetcode.com/problems/first-bad-version/
package arrays_and_hashing;

import java.util.*;

public class FirstBadVersion {
    // LeetCode Problem 278: First Bad Version
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        FirstBadVersion solver = new FirstBadVersion();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode278_FirstBadVersion (First Bad Version) Passed!");
    }
}
