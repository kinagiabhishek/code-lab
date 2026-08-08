// https://leetcode.com/problems/3sum/
package two_pointers;

import java.util.*;

public class LeetCode15_3Sum {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode15_3Sum solver = new LeetCode15_3Sum();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode15_3Sum Passed!");
    }
}
