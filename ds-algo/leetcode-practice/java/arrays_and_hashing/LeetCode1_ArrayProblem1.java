// https://leetcode.com/problems/problem-array-1/
package arrays_and_hashing;

import java.util.*;

public class LeetCode1_ArrayProblem1 {
    public int solve(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int n : nums) set.add(n);
        return set.size();
    }
    public static void main(String[] args) {
        LeetCode1_ArrayProblem1 solver = new LeetCode1_ArrayProblem1();
        assert solver.solve(new int[]{1, 2, 2, 3}) == 3;
        System.out.println("✅ LeetCode1_ArrayProblem1 Passed!");
    }
}
