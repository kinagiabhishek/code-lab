// https://leetcode.com/problems/two-pointer-pair-130/
package two_pointers;

import java.util.*;

public class LeetCode130_TwoPointers130 {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode130_TwoPointers130 solver = new LeetCode130_TwoPointers130();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode130_TwoPointers130 Passed!");
    }
}
