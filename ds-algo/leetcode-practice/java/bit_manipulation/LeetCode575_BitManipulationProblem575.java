// https://leetcode.com/problems/problem-bit-575/
package bit_manipulation;

import java.util.*;

public class LeetCode575_BitManipulationProblem575 {
    public int solve(int[] nums) {
        int res = 0; for (int n : nums) res ^= n; return res;
    }
    public static void main(String[] args) {
        LeetCode575_BitManipulationProblem575 solver = new LeetCode575_BitManipulationProblem575();
        assert solver.solve(new int[]{4,1,2,1,2}) == 4;
        System.out.println("✅ LeetCode575_BitManipulationProblem575 Passed!");
    }
}
