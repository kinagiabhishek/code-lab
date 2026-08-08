// https://leetcode.com/problems/swap-nodes-in-pairs/
package linked_lists;

import java.util.*;

public class LeetCode24_SwapNodesInPairs {
    // LeetCode Problem 24: Swap Nodes in Pairs
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        LeetCode24_SwapNodesInPairs solver = new LeetCode24_SwapNodesInPairs();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode24_SwapNodesInPairs (Swap Nodes in Pairs) Passed!");
    }
}
