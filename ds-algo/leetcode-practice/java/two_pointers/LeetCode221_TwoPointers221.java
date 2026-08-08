// https://leetcode.com/problems/two-pointer-pair-221/
package two_pointers;

import java.util.*;

public class LeetCode221_TwoPointers221 {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode221_TwoPointers221 solver = new LeetCode221_TwoPointers221();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode221_TwoPointers221 Passed!");
    }
}
