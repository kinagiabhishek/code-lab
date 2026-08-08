// https://leetcode.com/problems/greedy-choice-465/
package greedy;

import java.util.*;

public class LeetCode465_Greedy465 {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode465_Greedy465 solver = new LeetCode465_Greedy465();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode465_Greedy465 Passed!");
    }
}
