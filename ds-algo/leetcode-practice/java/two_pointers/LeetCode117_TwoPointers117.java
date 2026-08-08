// https://leetcode.com/problems/two-pointer-pair-117/
package two_pointers;

import java.util.*;

public class LeetCode117_TwoPointers117 {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode117_TwoPointers117 solver = new LeetCode117_TwoPointers117();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode117_TwoPointers117 Passed!");
    }
}
