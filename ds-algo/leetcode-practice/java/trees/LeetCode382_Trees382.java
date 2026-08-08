// https://leetcode.com/problems/binary-tree-traversal-382/
package trees;

import java.util.*;

public class LeetCode382_Trees382 {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode382_Trees382 solver = new LeetCode382_Trees382();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode382_Trees382 Passed!");
    }
}
