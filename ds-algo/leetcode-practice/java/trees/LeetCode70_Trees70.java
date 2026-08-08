// https://leetcode.com/problems/binary-tree-traversal-70/
package trees;

import java.util.*;

public class LeetCode70_Trees70 {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode70_Trees70 solver = new LeetCode70_Trees70();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode70_Trees70 Passed!");
    }
}
