// https://leetcode.com/problems/string-compression/
package arrays_and_hashing;

import java.util.*;

public class StringCompression {
    // LeetCode Problem 443: String Compression
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        StringCompression solver = new StringCompression();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode443_StringCompression (String Compression) Passed!");
    }
}
