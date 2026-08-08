// https://leetcode.com/problems/bit-manipulation-op-401/
package bit_manipulation;

import java.util.*;

public class LeetCode401_BitManipulation401 {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode401_BitManipulation401 solver = new LeetCode401_BitManipulation401();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode401_BitManipulation401 Passed!");
    }
}
