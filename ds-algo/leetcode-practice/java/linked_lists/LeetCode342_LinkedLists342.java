// https://leetcode.com/problems/linked-list-node-342/
package linked_lists;

import java.util.*;

public class LeetCode342_LinkedLists342 {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode342_LinkedLists342 solver = new LeetCode342_LinkedLists342();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode342_LinkedLists342 Passed!");
    }
}
