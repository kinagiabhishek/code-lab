// https://leetcode.com/problems/problem-array-36/
package arrays_and_hashing;

import java.util.*;

public class LeetCode36_ArrayProblem36 {
    public int solve(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int n : nums) set.add(n);
        return set.size();
    }
    public static void main(String[] args) {
        LeetCode36_ArrayProblem36 solver = new LeetCode36_ArrayProblem36();
        assert solver.solve(new int[]{1, 2, 2, 3}) == 3;
        System.out.println("✅ LeetCode36_ArrayProblem36 Passed!");
    }
}
