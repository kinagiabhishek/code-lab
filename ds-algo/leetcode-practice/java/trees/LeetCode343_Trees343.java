// https://leetcode.com/problems/binary-tree-traversal-343/
package trees;

import java.util.*;

public class LeetCode343_Trees343 {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode343_Trees343 solver = new LeetCode343_Trees343();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode343_Trees343 Passed!");
    }
}
