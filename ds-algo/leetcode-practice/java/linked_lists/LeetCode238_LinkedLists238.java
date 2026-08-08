// https://leetcode.com/problems/linked-list-node-238/
package linked_lists;

import java.util.*;

public class LeetCode238_LinkedLists238 {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode238_LinkedLists238 solver = new LeetCode238_LinkedLists238();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode238_LinkedLists238 Passed!");
    }
}
