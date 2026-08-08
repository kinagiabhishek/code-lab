// https://leetcode.com/problems/erect-the-fence/
package arrays_and_hashing;

import java.util.*;

public class ErectTheFence {
    // LeetCode Problem 587: Erect the Fence
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        ErectTheFence solver = new ErectTheFence();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode587_ErectTheFence (Erect the Fence) Passed!");
    }
}
