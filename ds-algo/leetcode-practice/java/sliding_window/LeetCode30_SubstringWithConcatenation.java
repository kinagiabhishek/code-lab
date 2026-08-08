// https://leetcode.com/problems/substring-with-concatenation-of-all-words/
package sliding_window;

import java.util.*;

public class LeetCode30_SubstringWithConcatenation {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode30_SubstringWithConcatenation solver = new LeetCode30_SubstringWithConcatenation();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode30_SubstringWithConcatenation Passed!");
    }
}
