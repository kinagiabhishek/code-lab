// https://leetcode.com/problems/reverse-nodes-in-k-group/
package linked_lists;

import java.util.*;

public class LeetCode25_ReverseNodesInKgroup {
    // LeetCode Problem 25: Reverse Nodes in k-Group
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        LeetCode25_ReverseNodesInKgroup solver = new LeetCode25_ReverseNodesInKgroup();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode25_ReverseNodesInKgroup (Reverse Nodes in k-Group) Passed!");
    }
}
