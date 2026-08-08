// https://leetcode.com/problems/linked-list-node-472/
package linked_lists;

import java.util.*;

public class LeetCode472_LinkedLists472 {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode472_LinkedLists472 solver = new LeetCode472_LinkedLists472();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode472_LinkedLists472 Passed!");
    }
}
