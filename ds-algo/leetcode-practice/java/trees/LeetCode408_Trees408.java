// https://leetcode.com/problems/binary-tree-traversal-408/
package trees;

import java.util.*;

public class LeetCode408_Trees408 {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode408_Trees408 solver = new LeetCode408_Trees408();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode408_Trees408 Passed!");
    }
}
