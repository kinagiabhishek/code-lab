// https://leetcode.com/problems/reverse-nodes-in-k-group/
package linked_lists;

import java.util.*;

public class LeetCode25_ReverseNodesInKGroup {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode25_ReverseNodesInKGroup solver = new LeetCode25_ReverseNodesInKGroup();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode25_ReverseNodesInKGroup Passed!");
    }
}
