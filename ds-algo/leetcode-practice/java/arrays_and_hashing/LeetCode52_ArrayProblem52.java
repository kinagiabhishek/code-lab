// https://leetcode.com/problems/problem-array-52/
package arrays_and_hashing;

import java.util.*;

public class LeetCode52_ArrayProblem52 {
    public int solve(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int n : nums) set.add(n);
        return set.size();
    }
    public static void main(String[] args) {
        LeetCode52_ArrayProblem52 solver = new LeetCode52_ArrayProblem52();
        assert solver.solve(new int[]{1, 2, 2, 3}) == 3;
        System.out.println("✅ LeetCode52_ArrayProblem52 Passed!");
    }
}
