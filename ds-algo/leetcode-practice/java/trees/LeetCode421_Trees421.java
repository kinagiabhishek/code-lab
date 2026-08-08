// https://leetcode.com/problems/binary-tree-traversal-421/
package trees;

import java.util.*;

public class LeetCode421_Trees421 {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode421_Trees421 solver = new LeetCode421_Trees421();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode421_Trees421 Passed!");
    }
}
