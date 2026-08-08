// https://leetcode.com/problems/linked-list-node-303/
package linked_lists;

import java.util.*;

public class LeetCode303_LinkedLists303 {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode303_LinkedLists303 solver = new LeetCode303_LinkedLists303();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode303_LinkedLists303 Passed!");
    }
}
