// https://leetcode.com/problems/binary-tree-traversal-330/
package trees;

import java.util.*;

public class LeetCode330_Trees330 {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode330_Trees330 solver = new LeetCode330_Trees330();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode330_Trees330 Passed!");
    }
}
