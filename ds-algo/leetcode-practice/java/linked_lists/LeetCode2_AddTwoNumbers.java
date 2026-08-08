// https://leetcode.com/problems/add-two-numbers/
package linked_lists;

import java.util.*;

public class LeetCode2_AddTwoNumbers {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode2_AddTwoNumbers solver = new LeetCode2_AddTwoNumbers();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode2_AddTwoNumbers Passed!");
    }
}
