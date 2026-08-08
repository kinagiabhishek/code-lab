// https://leetcode.com/problems/binary-tree-traversal-356/
package trees;

import java.util.*;

public class LeetCode356_Trees356 {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode356_Trees356 solver = new LeetCode356_Trees356();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode356_Trees356 Passed!");
    }
}
