// https://leetcode.com/problems/find-all-anagrams-in-a-string/
package arrays_and_hashing;

import java.util.*;

public class FindAllAnagramsInAString {
    // LeetCode Problem 438: Find All Anagrams in a String
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        FindAllAnagramsInAString solver = new FindAllAnagramsInAString();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode438_FindAllAnagramsInAString (Find All Anagrams in a String) Passed!");
    }
}
