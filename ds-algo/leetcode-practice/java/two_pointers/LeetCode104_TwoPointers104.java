// https://leetcode.com/problems/two-pointer-pair-104/
package two_pointers;

import java.util.*;

public class LeetCode104_TwoPointers104 {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode104_TwoPointers104 solver = new LeetCode104_TwoPointers104();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode104_TwoPointers104 Passed!");
    }
}
