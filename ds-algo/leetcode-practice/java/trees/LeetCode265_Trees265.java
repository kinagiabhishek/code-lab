// https://leetcode.com/problems/binary-tree-traversal-265/
package trees;

import java.util.*;

public class LeetCode265_Trees265 {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode265_Trees265 solver = new LeetCode265_Trees265();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode265_Trees265 Passed!");
    }
}
