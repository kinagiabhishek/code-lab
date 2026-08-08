// https://leetcode.com/problems/problem-array-4/
package arrays_and_hashing;

import java.util.*;

public class LeetCode4_ArrayProblem4 {
    public int solve(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int n : nums) set.add(n);
        return set.size();
    }
    public static void main(String[] args) {
        LeetCode4_ArrayProblem4 solver = new LeetCode4_ArrayProblem4();
        assert solver.solve(new int[]{1, 2, 2, 3}) == 3;
        System.out.println("✅ LeetCode4_ArrayProblem4 Passed!");
    }
}
