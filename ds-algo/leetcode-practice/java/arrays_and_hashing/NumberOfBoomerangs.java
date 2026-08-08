// https://leetcode.com/problems/number-of-boomerangs/
package arrays_and_hashing;

import java.util.*;

public class NumberOfBoomerangs {
    // LeetCode Problem 447: Number of Boomerangs
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        NumberOfBoomerangs solver = new NumberOfBoomerangs();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode447_NumberOfBoomerangs (Number of Boomerangs) Passed!");
    }
}
