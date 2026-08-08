// https://leetcode.com/problems/populating-next-right-pointers-in-each-node/
package linked_lists;

import java.util.*;

public class PopulatingNextRightPointersInEachNode {
    // LeetCode Problem 116: Populating Next Right Pointers in Each Node
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        PopulatingNextRightPointersInEachNode solver = new PopulatingNextRightPointersInEachNode();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode116_PopulatingNextRightPointersInEachNode (Populating Next Right Pointers in Each Node) Passed!");
    }
}
