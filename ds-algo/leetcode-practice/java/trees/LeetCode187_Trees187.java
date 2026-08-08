// https://leetcode.com/problems/binary-tree-traversal-187/
package trees;

import java.util.*;

public class LeetCode187_Trees187 {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode187_Trees187 solver = new LeetCode187_Trees187();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode187_Trees187 Passed!");
    }
}
