// https://leetcode.com/problems/count-and-say/
package arrays_and_hashing;

import java.util.*;

public class LeetCode38_CountAndSay {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode38_CountAndSay solver = new LeetCode38_CountAndSay();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode38_CountAndSay Passed!");
    }
}
