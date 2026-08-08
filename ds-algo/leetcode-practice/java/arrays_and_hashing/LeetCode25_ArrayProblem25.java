// https://leetcode.com/problems/problem-array-25/
package arrays_and_hashing;

import java.util.*;

public class LeetCode25_ArrayProblem25 {
    public int solve(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int n : nums) set.add(n);
        return set.size();
    }
    public static void main(String[] args) {
        LeetCode25_ArrayProblem25 solver = new LeetCode25_ArrayProblem25();
        assert solver.solve(new int[]{1, 2, 2, 3}) == 3;
        System.out.println("✅ LeetCode25_ArrayProblem25 Passed!");
    }
}
