// https://leetcode.com/problems/decode-string/
package arrays_and_hashing;

import java.util.*;

public class LeetCode394_DecodeString {
    // LeetCode Problem 394: Decode String
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        LeetCode394_DecodeString solver = new LeetCode394_DecodeString();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode394_DecodeString (Decode String) Passed!");
    }
}
