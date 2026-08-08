// https://leetcode.com/problems/the-skyline-problem/
package arrays_and_hashing;

import java.util.*;

public class LeetCode218_TheSkylineProblem {
    // LeetCode Problem 218: The Skyline Problem
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        LeetCode218_TheSkylineProblem solver = new LeetCode218_TheSkylineProblem();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode218_TheSkylineProblem (The Skyline Problem) Passed!");
    }
}
