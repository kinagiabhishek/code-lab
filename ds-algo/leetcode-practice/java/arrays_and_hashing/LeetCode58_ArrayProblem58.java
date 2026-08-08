// https://leetcode.com/problems/problem-array-58/
package arrays_and_hashing;

import java.util.*;

public class LeetCode58_ArrayProblem58 {
    public int solve(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int n : nums) set.add(n);
        return set.size();
    }
    public static void main(String[] args) {
        LeetCode58_ArrayProblem58 solver = new LeetCode58_ArrayProblem58();
        assert solver.solve(new int[]{1, 2, 2, 3}) == 3;
        System.out.println("✅ LeetCode58_ArrayProblem58 Passed!");
    }
}
