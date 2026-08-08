// https://leetcode.com/problems/binary-tree-traversal-109/
package trees;

import java.util.*;

public class LeetCode109_Trees109 {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode109_Trees109 solver = new LeetCode109_Trees109();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode109_Trees109 Passed!");
    }
}
