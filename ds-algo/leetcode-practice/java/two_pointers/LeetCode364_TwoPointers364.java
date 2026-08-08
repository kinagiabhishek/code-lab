// https://leetcode.com/problems/two-pointer-pair-364/
package two_pointers;

import java.util.*;

public class LeetCode364_TwoPointers364 {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode364_TwoPointers364 solver = new LeetCode364_TwoPointers364();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode364_TwoPointers364 Passed!");
    }
}
