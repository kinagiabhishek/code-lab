// https://leetcode.com/problems/problem-bit-558/
package bit_manipulation;

import java.util.*;

public class LeetCode558_BitManipulationProblem558 {
    public int solve(int[] nums) {
        int res = 0; for (int n : nums) res ^= n; return res;
    }
    public static void main(String[] args) {
        LeetCode558_BitManipulationProblem558 solver = new LeetCode558_BitManipulationProblem558();
        assert solver.solve(new int[]{4,1,2,1,2}) == 4;
        System.out.println("✅ LeetCode558_BitManipulationProblem558 Passed!");
    }
}
