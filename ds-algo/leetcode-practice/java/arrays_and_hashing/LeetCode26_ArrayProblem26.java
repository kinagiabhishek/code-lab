// https://leetcode.com/problems/problem-array-26/
package arrays_and_hashing;

import java.util.*;

public class LeetCode26_ArrayProblem26 {
    public int solve(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int n : nums) set.add(n);
        return set.size();
    }
    public static void main(String[] args) {
        LeetCode26_ArrayProblem26 solver = new LeetCode26_ArrayProblem26();
        assert solver.solve(new int[]{1, 2, 2, 3}) == 3;
        System.out.println("✅ LeetCode26_ArrayProblem26 Passed!");
    }
}
