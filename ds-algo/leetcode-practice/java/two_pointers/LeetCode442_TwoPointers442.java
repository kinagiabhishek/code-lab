// https://leetcode.com/problems/two-pointer-pair-442/
package two_pointers;

import java.util.*;

public class LeetCode442_TwoPointers442 {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode442_TwoPointers442 solver = new LeetCode442_TwoPointers442();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode442_TwoPointers442 Passed!");
    }
}
