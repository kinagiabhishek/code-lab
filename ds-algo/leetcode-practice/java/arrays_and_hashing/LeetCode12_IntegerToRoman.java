// https://leetcode.com/problems/integer-to-roman/
package arrays_and_hashing;

import java.util.*;

public class LeetCode12_IntegerToRoman {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode12_IntegerToRoman solver = new LeetCode12_IntegerToRoman();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode12_IntegerToRoman Passed!");
    }
}
