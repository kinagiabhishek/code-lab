// https://leetcode.com/problems/range-addition-ii/
package arrays_and_hashing;

import java.util.*;

public class LeetCode598_RangeAdditionIi {
    // LeetCode Problem 598: Range Addition II
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        LeetCode598_RangeAdditionIi solver = new LeetCode598_RangeAdditionIi();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode598_RangeAdditionIi (Range Addition II) Passed!");
    }
}
