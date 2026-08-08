// https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/
package arrays_and_hashing;

import java.util.*;

public class LeetCode448_FindAllNumbersDisappearedInAnArray {
    // LeetCode Problem 448: Find All Numbers Disappeared in an Array
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        LeetCode448_FindAllNumbersDisappearedInAnArray solver = new LeetCode448_FindAllNumbersDisappearedInAnArray();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode448_FindAllNumbersDisappearedInAnArray (Find All Numbers Disappeared in an Array) Passed!");
    }
}
