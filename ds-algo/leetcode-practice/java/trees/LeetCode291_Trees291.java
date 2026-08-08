// https://leetcode.com/problems/binary-tree-traversal-291/
package trees;

import java.util.*;

public class LeetCode291_Trees291 {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode291_Trees291 solver = new LeetCode291_Trees291();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode291_Trees291 Passed!");
    }
}
