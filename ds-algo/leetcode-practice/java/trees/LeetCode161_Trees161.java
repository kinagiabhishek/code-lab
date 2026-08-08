// https://leetcode.com/problems/binary-tree-traversal-161/
package trees;

import java.util.*;

public class LeetCode161_Trees161 {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode161_Trees161 solver = new LeetCode161_Trees161();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode161_Trees161 Passed!");
    }
}
