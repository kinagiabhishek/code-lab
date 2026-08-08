// https://leetcode.com/problems/two-pointer-pair-507/
package two_pointers;

import java.util.*;

public class LeetCode507_TwoPointers507 {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode507_TwoPointers507 solver = new LeetCode507_TwoPointers507();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode507_TwoPointers507 Passed!");
    }
}
