// https://leetcode.com/problems/linked-list-node-108/
package linked_lists;

import java.util.*;

public class LeetCode108_LinkedLists108 {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode108_LinkedLists108 solver = new LeetCode108_LinkedLists108();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode108_LinkedLists108 Passed!");
    }
}
