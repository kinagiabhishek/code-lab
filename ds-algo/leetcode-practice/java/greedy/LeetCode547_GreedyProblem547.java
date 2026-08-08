// https://leetcode.com/problems/problem-greedy-547/
package greedy;

import java.util.*;

public class LeetCode547_GreedyProblem547 {
    public int solve(int[] nums) {
        int max = nums[0], curr = nums[0];
        for (int i = 1; i < nums.length; i++) {
            curr = Math.max(nums[i], curr + nums[i]); max = Math.max(max, curr);
        }
        return max;
    }
    public static void main(String[] args) {
        LeetCode547_GreedyProblem547 solver = new LeetCode547_GreedyProblem547();
        assert solver.solve(new int[]{-2,1,-3,4,-1,2,1,-5,4}) == 6;
        System.out.println("✅ LeetCode547_GreedyProblem547 Passed!");
    }
}
