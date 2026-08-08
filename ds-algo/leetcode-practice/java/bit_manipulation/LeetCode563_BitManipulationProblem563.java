// https://leetcode.com/problems/problem-bit-563/
package bit_manipulation;

import java.util.*;

public class LeetCode563_BitManipulationProblem563 {
    public int solve(int[] nums) {
        int res = 0; for (int n : nums) res ^= n; return res;
    }
    public static void main(String[] args) {
        LeetCode563_BitManipulationProblem563 solver = new LeetCode563_BitManipulationProblem563();
        assert solver.solve(new int[]{4,1,2,1,2}) == 4;
        System.out.println("✅ LeetCode563_BitManipulationProblem563 Passed!");
    }
}
