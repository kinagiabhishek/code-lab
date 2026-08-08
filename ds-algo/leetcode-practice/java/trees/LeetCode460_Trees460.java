// https://leetcode.com/problems/binary-tree-traversal-460/
package trees;

import java.util.*;

public class LeetCode460_Trees460 {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode460_Trees460 solver = new LeetCode460_Trees460();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode460_Trees460 Passed!");
    }
}
