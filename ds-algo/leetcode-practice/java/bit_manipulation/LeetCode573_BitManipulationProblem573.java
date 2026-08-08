// https://leetcode.com/problems/problem-bit-573/
package bit_manipulation;

import java.util.*;

public class LeetCode573_BitManipulationProblem573 {
    public int solve(int[] nums) {
        int res = 0; for (int n : nums) res ^= n; return res;
    }
    public static void main(String[] args) {
        LeetCode573_BitManipulationProblem573 solver = new LeetCode573_BitManipulationProblem573();
        assert solver.solve(new int[]{4,1,2,1,2}) == 4;
        System.out.println("✅ LeetCode573_BitManipulationProblem573 Passed!");
    }
}
