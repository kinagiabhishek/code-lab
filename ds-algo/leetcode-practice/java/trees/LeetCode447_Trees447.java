// https://leetcode.com/problems/binary-tree-traversal-447/
package trees;

import java.util.*;

public class LeetCode447_Trees447 {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode447_Trees447 solver = new LeetCode447_Trees447();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode447_Trees447 Passed!");
    }
}
