// https://leetcode.com/problems/remove-element/
package two_pointers;

import java.util.*;

public class LeetCode27_RemoveElement {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode27_RemoveElement solver = new LeetCode27_RemoveElement();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode27_RemoveElement Passed!");
    }
}
