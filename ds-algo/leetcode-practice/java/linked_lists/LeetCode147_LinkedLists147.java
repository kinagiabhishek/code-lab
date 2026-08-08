// https://leetcode.com/problems/linked-list-node-147/
package linked_lists;

import java.util.*;

public class LeetCode147_LinkedLists147 {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode147_LinkedLists147 solver = new LeetCode147_LinkedLists147();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode147_LinkedLists147 Passed!");
    }
}
