// https://leetcode.com/problems/problem-array-8/
package arrays_and_hashing;

import java.util.*;

public class LeetCode8_ArrayProblem8 {
    public int solve(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int n : nums) set.add(n);
        return set.size();
    }
    public static void main(String[] args) {
        LeetCode8_ArrayProblem8 solver = new LeetCode8_ArrayProblem8();
        assert solver.solve(new int[]{1, 2, 2, 3}) == 3;
        System.out.println("✅ LeetCode8_ArrayProblem8 Passed!");
    }
}
