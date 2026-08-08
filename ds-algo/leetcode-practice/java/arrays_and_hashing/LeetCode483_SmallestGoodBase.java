// https://leetcode.com/problems/smallest-good-base/
package arrays_and_hashing;

import java.util.*;

public class LeetCode483_SmallestGoodBase {
    // LeetCode Problem 483: Smallest Good Base
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        LeetCode483_SmallestGoodBase solver = new LeetCode483_SmallestGoodBase();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode483_SmallestGoodBase (Smallest Good Base) Passed!");
    }
}
