// https://leetcode.com/problems/greedy-choice-296/
package greedy;

import java.util.*;

public class LeetCode296_Greedy296 {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode296_Greedy296 solver = new LeetCode296_Greedy296();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode296_Greedy296 Passed!");
    }
}
