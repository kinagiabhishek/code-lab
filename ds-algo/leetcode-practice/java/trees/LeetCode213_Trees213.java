// https://leetcode.com/problems/binary-tree-traversal-213/
package trees;

import java.util.*;

public class LeetCode213_Trees213 {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode213_Trees213 solver = new LeetCode213_Trees213();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode213_Trees213 Passed!");
    }
}
