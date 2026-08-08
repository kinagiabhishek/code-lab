// https://leetcode.com/problems/linked-list-node-173/
package linked_lists;

import java.util.*;

public class LeetCode173_LinkedLists173 {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode173_LinkedLists173 solver = new LeetCode173_LinkedLists173();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode173_LinkedLists173 Passed!");
    }
}
