// https://leetcode.com/problems/problem-array-2/
package arrays_and_hashing;

import java.util.*;

public class LeetCode2_ArrayProblem2 {
    public int solve(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int n : nums) set.add(n);
        return set.size();
    }
    public static void main(String[] args) {
        LeetCode2_ArrayProblem2 solver = new LeetCode2_ArrayProblem2();
        assert solver.solve(new int[]{1, 2, 2, 3}) == 3;
        System.out.println("✅ LeetCode2_ArrayProblem2 Passed!");
    }
}
