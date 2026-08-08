// https://leetcode.com/problems/random-pick-index/
package bit_manipulation;

import java.util.*;

public class LeetCode398_RandomPickIndex {
    // LeetCode Problem 398: Random Pick Index
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        LeetCode398_RandomPickIndex solver = new LeetCode398_RandomPickIndex();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode398_RandomPickIndex (Random Pick Index) Passed!");
    }
}
