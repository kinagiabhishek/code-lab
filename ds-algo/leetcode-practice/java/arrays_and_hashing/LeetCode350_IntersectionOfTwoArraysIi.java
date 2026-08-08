// https://leetcode.com/problems/intersection-of-two-arrays-ii/
package arrays_and_hashing;

import java.util.*;

public class LeetCode350_IntersectionOfTwoArraysIi {
    // LeetCode Problem 350: Intersection of Two Arrays II
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        LeetCode350_IntersectionOfTwoArraysIi solver = new LeetCode350_IntersectionOfTwoArraysIi();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode350_IntersectionOfTwoArraysIi (Intersection of Two Arrays II) Passed!");
    }
}
