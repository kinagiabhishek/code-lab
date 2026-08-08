// https://leetcode.com/problems/bit-manipulation-op-115/
package bit_manipulation;

import java.util.*;

public class LeetCode115_BitManipulation115 {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode115_BitManipulation115 solver = new LeetCode115_BitManipulation115();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode115_BitManipulation115 Passed!");
    }
}
