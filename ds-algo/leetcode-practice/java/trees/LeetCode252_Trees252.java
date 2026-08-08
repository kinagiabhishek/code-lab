// https://leetcode.com/problems/binary-tree-traversal-252/
package trees;

import java.util.*;

public class LeetCode252_Trees252 {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode252_Trees252 solver = new LeetCode252_Trees252();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode252_Trees252 Passed!");
    }
}
