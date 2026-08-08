// https://leetcode.com/problems/two-pointer-pair-260/
package two_pointers;

import java.util.*;

public class LeetCode260_TwoPointers260 {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode260_TwoPointers260 solver = new LeetCode260_TwoPointers260();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode260_TwoPointers260 Passed!");
    }
}
