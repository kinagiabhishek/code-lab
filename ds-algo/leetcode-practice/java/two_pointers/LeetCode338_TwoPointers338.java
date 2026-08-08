// https://leetcode.com/problems/two-pointer-pair-338/
package two_pointers;

import java.util.*;

public class LeetCode338_TwoPointers338 {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode338_TwoPointers338 solver = new LeetCode338_TwoPointers338();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode338_TwoPointers338 Passed!");
    }
}
