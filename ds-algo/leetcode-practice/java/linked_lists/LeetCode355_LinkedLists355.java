// https://leetcode.com/problems/linked-list-node-355/
package linked_lists;

import java.util.*;

public class LeetCode355_LinkedLists355 {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode355_LinkedLists355 solver = new LeetCode355_LinkedLists355();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode355_LinkedLists355 Passed!");
    }
}
