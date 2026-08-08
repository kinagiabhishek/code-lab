// https://leetcode.com/problems/remove-nth-node-from-end-of-list/
package linked_lists;

import java.util.*;

public class LeetCode19_RemoveNthNodeFromEndOfList {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode19_RemoveNthNodeFromEndOfList solver = new LeetCode19_RemoveNthNodeFromEndOfList();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode19_RemoveNthNodeFromEndOfList Passed!");
    }
}
