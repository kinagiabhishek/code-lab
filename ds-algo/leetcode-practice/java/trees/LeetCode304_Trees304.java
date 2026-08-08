// https://leetcode.com/problems/binary-tree-traversal-304/
package trees;

import java.util.*;

public class LeetCode304_Trees304 {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode304_Trees304 solver = new LeetCode304_Trees304();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode304_Trees304 Passed!");
    }
}
