// https://leetcode.com/problems/problem-array-35/
package arrays_and_hashing;

import java.util.*;

public class LeetCode35_ArrayProblem35 {
    public int solve(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int n : nums) set.add(n);
        return set.size();
    }
    public static void main(String[] args) {
        LeetCode35_ArrayProblem35 solver = new LeetCode35_ArrayProblem35();
        assert solver.solve(new int[]{1, 2, 2, 3}) == 3;
        System.out.println("✅ LeetCode35_ArrayProblem35 Passed!");
    }
}
