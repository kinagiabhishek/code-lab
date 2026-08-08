// https://leetcode.com/problems/binary-tree-traversal-369/
package trees;

import java.util.*;

public class LeetCode369_Trees369 {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode369_Trees369 solver = new LeetCode369_Trees369();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode369_Trees369 Passed!");
    }
}
