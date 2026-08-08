// https://leetcode.com/problems/binary-tree-traversal-122/
package trees;

import java.util.*;

public class LeetCode122_Trees122 {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode122_Trees122 solver = new LeetCode122_Trees122();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode122_Trees122 Passed!");
    }
}
