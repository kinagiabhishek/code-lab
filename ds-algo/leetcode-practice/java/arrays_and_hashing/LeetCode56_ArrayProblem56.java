// https://leetcode.com/problems/problem-array-56/
package arrays_and_hashing;

import java.util.*;

public class LeetCode56_ArrayProblem56 {
    public int solve(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int n : nums) set.add(n);
        return set.size();
    }
    public static void main(String[] args) {
        LeetCode56_ArrayProblem56 solver = new LeetCode56_ArrayProblem56();
        assert solver.solve(new int[]{1, 2, 2, 3}) == 3;
        System.out.println("✅ LeetCode56_ArrayProblem56 Passed!");
    }
}
