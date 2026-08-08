// https://leetcode.com/problems/binary-tree-traversal-174/
package trees;

import java.util.*;

public class LeetCode174_Trees174 {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode174_Trees174 solver = new LeetCode174_Trees174();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode174_Trees174 Passed!");
    }
}
