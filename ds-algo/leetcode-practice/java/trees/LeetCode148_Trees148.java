// https://leetcode.com/problems/binary-tree-traversal-148/
package trees;

import java.util.*;

public class LeetCode148_Trees148 {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode148_Trees148 solver = new LeetCode148_Trees148();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode148_Trees148 Passed!");
    }
}
