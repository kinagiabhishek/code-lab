// https://leetcode.com/problems/binary-tree-traversal-135/
package trees;

import java.util.*;

public class LeetCode135_Trees135 {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode135_Trees135 solver = new LeetCode135_Trees135();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode135_Trees135 Passed!");
    }
}
