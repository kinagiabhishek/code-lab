// https://leetcode.com/problems/two-pointer-pair-390/
package two_pointers;

import java.util.*;

public class LeetCode390_TwoPointers390 {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode390_TwoPointers390 solver = new LeetCode390_TwoPointers390();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode390_TwoPointers390 Passed!");
    }
}
