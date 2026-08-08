// https://leetcode.com/problems/problem-bit-561/
package bit_manipulation;

import java.util.*;

public class LeetCode561_BitManipulationProblem561 {
    public int solve(int[] nums) {
        int res = 0; for (int n : nums) res ^= n; return res;
    }
    public static void main(String[] args) {
        LeetCode561_BitManipulationProblem561 solver = new LeetCode561_BitManipulationProblem561();
        assert solver.solve(new int[]{4,1,2,1,2}) == 4;
        System.out.println("✅ LeetCode561_BitManipulationProblem561 Passed!");
    }
}
