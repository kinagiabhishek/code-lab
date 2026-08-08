// https://leetcode.com/problems/linked-list-node-121/
package linked_lists;

import java.util.*;

public class LeetCode121_LinkedLists121 {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode121_LinkedLists121 solver = new LeetCode121_LinkedLists121();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode121_LinkedLists121 Passed!");
    }
}
