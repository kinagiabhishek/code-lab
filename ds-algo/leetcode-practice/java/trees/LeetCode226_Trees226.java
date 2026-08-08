// https://leetcode.com/problems/binary-tree-traversal-226/
package trees;

import java.util.*;

public class LeetCode226_Trees226 {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode226_Trees226 solver = new LeetCode226_Trees226();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode226_Trees226 Passed!");
    }
}
