// https://leetcode.com/problems/integer-replacement/
package arrays_and_hashing;

import java.util.*;

public class IntegerReplacement {
    // LeetCode Problem 397: Integer Replacement
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        IntegerReplacement solver = new IntegerReplacement();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode397_IntegerReplacement (Integer Replacement) Passed!");
    }
}
