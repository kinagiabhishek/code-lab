// https://leetcode.com/problems/two-pointer-pair-52/
package two_pointers;

import java.util.*;

public class LeetCode52_TwoPointers52 {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode52_TwoPointers52 solver = new LeetCode52_TwoPointers52();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode52_TwoPointers52 Passed!");
    }
}
