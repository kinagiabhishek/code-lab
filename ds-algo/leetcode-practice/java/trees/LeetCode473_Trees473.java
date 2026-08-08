// https://leetcode.com/problems/binary-tree-traversal-473/
package trees;

import java.util.*;

public class LeetCode473_Trees473 {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode473_Trees473 solver = new LeetCode473_Trees473();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode473_Trees473 Passed!");
    }
}
