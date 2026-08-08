// https://leetcode.com/problems/two-pointer-pair-325/
package two_pointers;

import java.util.*;

public class LeetCode325_TwoPointers325 {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode325_TwoPointers325 solver = new LeetCode325_TwoPointers325();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode325_TwoPointers325 Passed!");
    }
}
