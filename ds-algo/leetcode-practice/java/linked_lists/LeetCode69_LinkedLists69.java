// https://leetcode.com/problems/linked-list-node-69/
package linked_lists;

import java.util.*;

public class LeetCode69_LinkedLists69 {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode69_LinkedLists69 solver = new LeetCode69_LinkedLists69();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode69_LinkedLists69 Passed!");
    }
}
