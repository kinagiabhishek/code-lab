// https://leetcode.com/problems/problem-bit-576/
package bit_manipulation;

import java.util.*;

public class LeetCode576_BitManipulationProblem576 {
    public int solve(int[] nums) {
        int res = 0; for (int n : nums) res ^= n; return res;
    }
    public static void main(String[] args) {
        LeetCode576_BitManipulationProblem576 solver = new LeetCode576_BitManipulationProblem576();
        assert solver.solve(new int[]{4,1,2,1,2}) == 4;
        System.out.println("✅ LeetCode576_BitManipulationProblem576 Passed!");
    }
}
