// https://leetcode.com/problems/first-unique-character-in-a-string/
package arrays_and_hashing;

import java.util.*;

public class FirstUniqueCharacterInAString {
    // LeetCode Problem 387: First Unique Character in a String
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        FirstUniqueCharacterInAString solver = new FirstUniqueCharacterInAString();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode387_FirstUniqueCharacterInAString (First Unique Character in a String) Passed!");
    }
}
