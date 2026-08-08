// https://leetcode.com/problems/linked-list-node-56/
package linked_lists;

import java.util.*;

public class LeetCode56_LinkedLists56 {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode56_LinkedLists56 solver = new LeetCode56_LinkedLists56();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode56_LinkedLists56 Passed!");
    }
}
