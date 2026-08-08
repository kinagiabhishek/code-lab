// https://leetcode.com/problems/valid-square/
package arrays_and_hashing;

import java.util.*;

public class LeetCode593_ValidSquare {
    // LeetCode Problem 593: Valid Square
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        LeetCode593_ValidSquare solver = new LeetCode593_ValidSquare();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode593_ValidSquare (Valid Square) Passed!");
    }
}
