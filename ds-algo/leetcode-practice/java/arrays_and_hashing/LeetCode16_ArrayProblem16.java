// https://leetcode.com/problems/problem-array-16/
package arrays_and_hashing;

import java.util.*;

public class LeetCode16_ArrayProblem16 {
    public int solve(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int n : nums) set.add(n);
        return set.size();
    }
    public static void main(String[] args) {
        LeetCode16_ArrayProblem16 solver = new LeetCode16_ArrayProblem16();
        assert solver.solve(new int[]{1, 2, 2, 3}) == 3;
        System.out.println("✅ LeetCode16_ArrayProblem16 Passed!");
    }
}
