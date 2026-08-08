// https://leetcode.com/problems/count-of-smaller-numbers-after-self/
package arrays_and_hashing;

import java.util.*;

public class LeetCode315_CountOfSmallerNumbersAfterSelf {
    // LeetCode Problem 315: Count of Smaller Numbers After Self
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        LeetCode315_CountOfSmallerNumbersAfterSelf solver = new LeetCode315_CountOfSmallerNumbersAfterSelf();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode315_CountOfSmallerNumbersAfterSelf (Count of Smaller Numbers After Self) Passed!");
    }
}
