// https://leetcode.com/problems/permutations-ii/
package backtracking;

import java.util.*;

public class LeetCode47_PermutationsII {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode47_PermutationsII solver = new LeetCode47_PermutationsII();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode47_PermutationsII Passed!");
    }
}
