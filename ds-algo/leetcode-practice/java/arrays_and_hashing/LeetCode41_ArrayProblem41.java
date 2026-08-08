// https://leetcode.com/problems/problem-array-41/
package arrays_and_hashing;

import java.util.*;

public class LeetCode41_ArrayProblem41 {
    public int solve(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int n : nums) set.add(n);
        return set.size();
    }
    public static void main(String[] args) {
        LeetCode41_ArrayProblem41 solver = new LeetCode41_ArrayProblem41();
        assert solver.solve(new int[]{1, 2, 2, 3}) == 3;
        System.out.println("✅ LeetCode41_ArrayProblem41 Passed!");
    }
}
