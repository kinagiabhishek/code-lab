// https://leetcode.com/problems/binary-tree-traversal-200/
package trees;

import java.util.*;

public class LeetCode200_Trees200 {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode200_Trees200 solver = new LeetCode200_Trees200();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode200_Trees200 Passed!");
    }
}
