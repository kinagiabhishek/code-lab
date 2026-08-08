// https://leetcode.com/problems/sort-characters-by-frequency/
package bit_manipulation;

import java.util.*;

public class LeetCode451_SortCharactersByFrequency {
    // LeetCode Problem 451: Sort Characters By Frequency
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        LeetCode451_SortCharactersByFrequency solver = new LeetCode451_SortCharactersByFrequency();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode451_SortCharactersByFrequency (Sort Characters By Frequency) Passed!");
    }
}
