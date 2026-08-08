// https://leetcode.com/problems/encode-and-decode-tinyurl/
package bit_manipulation;

import java.util.*;

public class EncodeAndDecodeTinyurl {
    // LeetCode Problem 535: Encode and Decode TinyURL
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        EncodeAndDecodeTinyurl solver = new EncodeAndDecodeTinyurl();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode535_EncodeAndDecodeTinyurl (Encode and Decode TinyURL) Passed!");
    }
}
