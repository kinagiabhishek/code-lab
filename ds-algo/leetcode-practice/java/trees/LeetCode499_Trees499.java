// https://leetcode.com/problems/binary-tree-traversal-499/
package trees;

import java.util.*;

public class LeetCode499_Trees499 {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode499_Trees499 solver = new LeetCode499_Trees499();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode499_Trees499 Passed!");
    }
}
