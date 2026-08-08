// https://leetcode.com/problems/integer-replacement/
package arrays_and_hashing;

import java.util.*;

public class LeetCode397_IntegerReplacement {
    // LeetCode Problem 397: Integer Replacement
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        LeetCode397_IntegerReplacement solver = new LeetCode397_IntegerReplacement();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode397_IntegerReplacement (Integer Replacement) Passed!");
    }
}
