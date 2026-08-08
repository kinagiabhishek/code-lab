// https://leetcode.com/problems/problem-array-13/
package arrays_and_hashing;

import java.util.*;

public class LeetCode13_ArrayProblem13 {
    public int solve(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int n : nums) set.add(n);
        return set.size();
    }
    public static void main(String[] args) {
        LeetCode13_ArrayProblem13 solver = new LeetCode13_ArrayProblem13();
        assert solver.solve(new int[]{1, 2, 2, 3}) == 3;
        System.out.println("✅ LeetCode13_ArrayProblem13 Passed!");
    }
}
