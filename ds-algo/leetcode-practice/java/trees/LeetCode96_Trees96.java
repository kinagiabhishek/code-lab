// https://leetcode.com/problems/binary-tree-traversal-96/
package trees;

import java.util.*;

public class LeetCode96_Trees96 {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode96_Trees96 solver = new LeetCode96_Trees96();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode96_Trees96 Passed!");
    }
}
