// https://leetcode.com/problems/two-pointer-pair-286/
package two_pointers;

import java.util.*;

public class LeetCode286_TwoPointers286 {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode286_TwoPointers286 solver = new LeetCode286_TwoPointers286();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode286_TwoPointers286 Passed!");
    }
}
