// https://leetcode.com/problems/greedy-choice-88/
package greedy;

import java.util.*;

public class LeetCode88_Greedy88 {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode88_Greedy88 solver = new LeetCode88_Greedy88();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode88_Greedy88 Passed!");
    }
}
