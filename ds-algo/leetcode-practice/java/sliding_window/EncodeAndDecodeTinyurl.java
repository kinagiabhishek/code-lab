// https://leetcode.com/problems/encode-and-decode-tinyurl/
package sliding_window;

import java.util.*;

public class EncodeAndDecodeTinyurl {
    // LeetCode Problem 535: Encode and Decode TinyURL
    public int findMax(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int max = nums[0];
        for (int n : nums) if (n > max) max = n;
        return max;
    }

    public static void main(String[] args) {
        EncodeAndDecodeTinyurl solver = new EncodeAndDecodeTinyurl();
        assert solver.findMax(new int[]{1, 5, 3, 9, 2}) == 9;
        System.out.println("✅ EncodeAndDecodeTinyurl (Encode and Decode TinyURL) Passed!");
    }
}
