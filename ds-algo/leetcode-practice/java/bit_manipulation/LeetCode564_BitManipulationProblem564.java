// https://leetcode.com/problems/problem-bit-564/
package bit_manipulation;

import java.util.*;

public class LeetCode564_BitManipulationProblem564 {
    public int solve(int[] nums) {
        int res = 0; for (int n : nums) res ^= n; return res;
    }
    public static void main(String[] args) {
        LeetCode564_BitManipulationProblem564 solver = new LeetCode564_BitManipulationProblem564();
        assert solver.solve(new int[]{4,1,2,1,2}) == 4;
        System.out.println("✅ LeetCode564_BitManipulationProblem564 Passed!");
    }
}
