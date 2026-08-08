// https://leetcode.com/problems/two-pointer-pair-455/
package two_pointers;

import java.util.*;

public class LeetCode455_TwoPointers455 {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode455_TwoPointers455 solver = new LeetCode455_TwoPointers455();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode455_TwoPointers455 Passed!");
    }
}
