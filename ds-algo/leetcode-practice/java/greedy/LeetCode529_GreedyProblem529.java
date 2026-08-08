// https://leetcode.com/problems/problem-greedy-529/
package greedy;

import java.util.*;

public class LeetCode529_GreedyProblem529 {
    public int solve(int[] nums) {
        int max = nums[0], curr = nums[0];
        for (int i = 1; i < nums.length; i++) {
            curr = Math.max(nums[i], curr + nums[i]); max = Math.max(max, curr);
        }
        return max;
    }
    public static void main(String[] args) {
        LeetCode529_GreedyProblem529 solver = new LeetCode529_GreedyProblem529();
        assert solver.solve(new int[]{-2,1,-3,4,-1,2,1,-5,4}) == 6;
        System.out.println("✅ LeetCode529_GreedyProblem529 Passed!");
    }
}
