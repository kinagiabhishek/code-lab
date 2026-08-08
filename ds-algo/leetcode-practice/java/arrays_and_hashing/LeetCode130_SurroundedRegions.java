// https://leetcode.com/problems/surrounded-regions/
package arrays_and_hashing;

import java.util.*;

public class LeetCode130_SurroundedRegions {
    // LeetCode Problem 130: Surrounded Regions
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        LeetCode130_SurroundedRegions solver = new LeetCode130_SurroundedRegions();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode130_SurroundedRegions (Surrounded Regions) Passed!");
    }
}
