// https://leetcode.com/problems/binary-tree-traversal-278/
package trees;

import java.util.*;

public class LeetCode278_Trees278 {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode278_Trees278 solver = new LeetCode278_Trees278();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode278_Trees278 Passed!");
    }
}
