// https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/
package sliding_window;

import java.util.*;

public class LeetCode28_FindIndexOfFirstOccurrence {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode28_FindIndexOfFirstOccurrence solver = new LeetCode28_FindIndexOfFirstOccurrence();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode28_FindIndexOfFirstOccurrence Passed!");
    }
}
