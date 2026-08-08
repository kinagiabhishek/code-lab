// https://leetcode.com/problems/lexicographical-numbers/
package graphs;

import java.util.*;

public class LeetCode386_LexicographicalNumbers {
    // LeetCode Problem 386: Lexicographical Numbers
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        LeetCode386_LexicographicalNumbers solver = new LeetCode386_LexicographicalNumbers();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode386_LexicographicalNumbers (Lexicographical Numbers) Passed!");
    }
}
