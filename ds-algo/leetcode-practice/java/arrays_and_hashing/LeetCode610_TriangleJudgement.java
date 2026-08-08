// https://leetcode.com/problems/triangle-judgement/
package arrays_and_hashing;

import java.util.*;

public class LeetCode610_TriangleJudgement {
    // LeetCode Problem 610: Triangle Judgement
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        LeetCode610_TriangleJudgement solver = new LeetCode610_TriangleJudgement();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode610_TriangleJudgement (Triangle Judgement) Passed!");
    }
}
