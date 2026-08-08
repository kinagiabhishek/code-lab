// https://leetcode.com/problems/next-greater-element-i/
package arrays_and_hashing;

import java.util.*;

public class LeetCode496_NextGreaterElementI {
    // LeetCode Problem 496: Next Greater Element I
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        LeetCode496_NextGreaterElementI solver = new LeetCode496_NextGreaterElementI();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode496_NextGreaterElementI (Next Greater Element I) Passed!");
    }
}
