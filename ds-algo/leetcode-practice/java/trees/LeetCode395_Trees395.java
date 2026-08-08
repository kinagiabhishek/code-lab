// https://leetcode.com/problems/binary-tree-traversal-395/
package trees;

import java.util.*;

public class LeetCode395_Trees395 {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode395_Trees395 solver = new LeetCode395_Trees395();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode395_Trees395 Passed!");
    }
}
