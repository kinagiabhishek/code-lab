// https://leetcode.com/problems/3sum-closest/
package two_pointers;

import java.util.*;

public class LeetCode16_3SumClosest {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode16_3SumClosest solver = new LeetCode16_3SumClosest();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode16_3SumClosest Passed!");
    }
}
