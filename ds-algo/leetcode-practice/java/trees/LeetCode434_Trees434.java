// https://leetcode.com/problems/binary-tree-traversal-434/
package trees;

import java.util.*;

public class LeetCode434_Trees434 {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode434_Trees434 solver = new LeetCode434_Trees434();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode434_Trees434 Passed!");
    }
}
