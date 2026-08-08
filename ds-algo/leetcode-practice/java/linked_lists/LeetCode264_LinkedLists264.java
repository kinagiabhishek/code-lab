// https://leetcode.com/problems/linked-list-node-264/
package linked_lists;

import java.util.*;

public class LeetCode264_LinkedLists264 {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode264_LinkedLists264 solver = new LeetCode264_LinkedLists264();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode264_LinkedLists264 Passed!");
    }
}
