// https://leetcode.com/problems/linked-list-node-485/
package linked_lists;

import java.util.*;

public class LeetCode485_LinkedLists485 {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode485_LinkedLists485 solver = new LeetCode485_LinkedLists485();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode485_LinkedLists485 Passed!");
    }
}
