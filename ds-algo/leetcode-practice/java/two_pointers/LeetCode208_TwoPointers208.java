// https://leetcode.com/problems/two-pointer-pair-208/
package two_pointers;

import java.util.*;

public class LeetCode208_TwoPointers208 {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode208_TwoPointers208 solver = new LeetCode208_TwoPointers208();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode208_TwoPointers208 Passed!");
    }
}
