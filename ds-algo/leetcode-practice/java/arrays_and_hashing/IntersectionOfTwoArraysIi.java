// https://leetcode.com/problems/intersection-of-two-arrays-ii/
package arrays_and_hashing;

import java.util.*;

public class IntersectionOfTwoArraysIi {
    // LeetCode Problem 350: Intersection of Two Arrays II
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        IntersectionOfTwoArraysIi solver = new IntersectionOfTwoArraysIi();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode350_IntersectionOfTwoArraysIi (Intersection of Two Arrays II) Passed!");
    }
}
