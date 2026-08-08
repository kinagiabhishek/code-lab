// https://leetcode.com/problems/problem-bit-574/
package bit_manipulation;

import java.util.*;

public class LeetCode574_BitManipulationProblem574 {
    public int solve(int[] nums) {
        int res = 0; for (int n : nums) res ^= n; return res;
    }
    public static void main(String[] args) {
        LeetCode574_BitManipulationProblem574 solver = new LeetCode574_BitManipulationProblem574();
        assert solver.solve(new int[]{4,1,2,1,2}) == 4;
        System.out.println("✅ LeetCode574_BitManipulationProblem574 Passed!");
    }
}
