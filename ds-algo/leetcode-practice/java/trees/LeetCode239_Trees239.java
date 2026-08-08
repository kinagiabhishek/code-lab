// https://leetcode.com/problems/binary-tree-traversal-239/
package trees;

import java.util.*;

public class LeetCode239_Trees239 {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode239_Trees239 solver = new LeetCode239_Trees239();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode239_Trees239 Passed!");
    }
}
