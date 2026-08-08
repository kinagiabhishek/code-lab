// https://leetcode.com/problems/problem-bit-580/
package bit_manipulation;

import java.util.*;

public class LeetCode580_BitManipulationProblem580 {
    public int solve(int[] nums) {
        int res = 0; for (int n : nums) res ^= n; return res;
    }
    public static void main(String[] args) {
        LeetCode580_BitManipulationProblem580 solver = new LeetCode580_BitManipulationProblem580();
        assert solver.solve(new int[]{4,1,2,1,2}) == 4;
        System.out.println("✅ LeetCode580_BitManipulationProblem580 Passed!");
    }
}
