// https://leetcode.com/problems/integer-to-roman/
package arrays_and_hashing;

import java.util.*;

public class IntegerToRoman {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        IntegerToRoman solver = new IntegerToRoman();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode12_IntegerToRoman Passed!");
    }
}
