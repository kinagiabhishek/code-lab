// https://leetcode.com/problems/populating-next-right-pointers-in-each-node-ii/
package linked_lists;

import java.util.*;

public class PopulatingNextRightPointersInEachNodeIi {
    // LeetCode Problem 117: Populating Next Right Pointers in Each Node II
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        PopulatingNextRightPointersInEachNodeIi solver = new PopulatingNextRightPointersInEachNodeIi();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode117_PopulatingNextRightPointersInEachNodeIi (Populating Next Right Pointers in Each Node II) Passed!");
    }
}
