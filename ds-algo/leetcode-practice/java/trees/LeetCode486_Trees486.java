// https://leetcode.com/problems/binary-tree-traversal-486/
package trees;

import java.util.*;

public class LeetCode486_Trees486 {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode486_Trees486 solver = new LeetCode486_Trees486();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode486_Trees486 Passed!");
    }
}
