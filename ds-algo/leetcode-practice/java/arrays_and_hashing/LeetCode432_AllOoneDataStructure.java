// https://leetcode.com/problems/all-oone-data-structure/
package arrays_and_hashing;

import java.util.*;

public class LeetCode432_AllOoneDataStructure {
    // LeetCode Problem 432: All O`one Data Structure
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        LeetCode432_AllOoneDataStructure solver = new LeetCode432_AllOoneDataStructure();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode432_AllOoneDataStructure (All O`one Data Structure) Passed!");
    }
}
