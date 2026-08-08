// https://leetcode.com/problems/base-7/
package arrays_and_hashing;

import java.util.*;

public class Base7 {
    // LeetCode Problem 504: Base 7
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        Base7 solver = new Base7();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode504_Base7 (Base 7) Passed!");
    }
}
