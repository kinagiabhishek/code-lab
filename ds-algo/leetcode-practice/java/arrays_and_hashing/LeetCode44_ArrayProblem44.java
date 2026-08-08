// https://leetcode.com/problems/problem-array-44/
package arrays_and_hashing;

import java.util.*;

public class LeetCode44_ArrayProblem44 {
    public int solve(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int n : nums) set.add(n);
        return set.size();
    }
    public static void main(String[] args) {
        LeetCode44_ArrayProblem44 solver = new LeetCode44_ArrayProblem44();
        assert solver.solve(new int[]{1, 2, 2, 3}) == 3;
        System.out.println("✅ LeetCode44_ArrayProblem44 Passed!");
    }
}
