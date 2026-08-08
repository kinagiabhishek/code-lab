// https://leetcode.com/problems/problem-array-33/
package arrays_and_hashing;

import java.util.*;

public class LeetCode33_ArrayProblem33 {
    public int solve(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int n : nums) set.add(n);
        return set.size();
    }
    public static void main(String[] args) {
        LeetCode33_ArrayProblem33 solver = new LeetCode33_ArrayProblem33();
        assert solver.solve(new int[]{1, 2, 2, 3}) == 3;
        System.out.println("✅ LeetCode33_ArrayProblem33 Passed!");
    }
}
