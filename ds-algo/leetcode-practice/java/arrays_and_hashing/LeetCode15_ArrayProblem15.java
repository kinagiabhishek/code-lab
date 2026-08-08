// https://leetcode.com/problems/problem-array-15/
package arrays_and_hashing;

import java.util.*;

public class LeetCode15_ArrayProblem15 {
    public int solve(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int n : nums) set.add(n);
        return set.size();
    }
    public static void main(String[] args) {
        LeetCode15_ArrayProblem15 solver = new LeetCode15_ArrayProblem15();
        assert solver.solve(new int[]{1, 2, 2, 3}) == 3;
        System.out.println("✅ LeetCode15_ArrayProblem15 Passed!");
    }
}
