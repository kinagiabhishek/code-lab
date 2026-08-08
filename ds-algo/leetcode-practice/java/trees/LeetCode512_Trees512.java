// https://leetcode.com/problems/binary-tree-traversal-512/
package trees;

import java.util.*;

public class LeetCode512_Trees512 {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode512_Trees512 solver = new LeetCode512_Trees512();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode512_Trees512 Passed!");
    }
}
