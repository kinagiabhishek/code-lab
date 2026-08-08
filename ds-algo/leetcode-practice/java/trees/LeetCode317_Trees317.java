// https://leetcode.com/problems/binary-tree-traversal-317/
package trees;

import java.util.*;

public class LeetCode317_Trees317 {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode317_Trees317 solver = new LeetCode317_Trees317();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode317_Trees317 Passed!");
    }
}
