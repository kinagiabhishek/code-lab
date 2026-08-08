// https://leetcode.com/problems/problem-array-14/
package arrays_and_hashing;

import java.util.*;

public class LeetCode14_ArrayProblem14 {
    public int solve(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int n : nums) set.add(n);
        return set.size();
    }
    public static void main(String[] args) {
        LeetCode14_ArrayProblem14 solver = new LeetCode14_ArrayProblem14();
        assert solver.solve(new int[]{1, 2, 2, 3}) == 3;
        System.out.println("✅ LeetCode14_ArrayProblem14 Passed!");
    }
}
