// https://leetcode.com/problems/binary-tree-traversal-57/
package trees;

import java.util.*;

public class LeetCode57_Trees57 {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode57_Trees57 solver = new LeetCode57_Trees57();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode57_Trees57 Passed!");
    }
}
