// https://leetcode.com/problems/binary-tree-traversal-83/
package trees;

import java.util.*;

public class LeetCode83_Trees83 {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode83_Trees83 solver = new LeetCode83_Trees83();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode83_Trees83 Passed!");
    }
}
