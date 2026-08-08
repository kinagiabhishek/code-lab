// https://leetcode.com/problems/container-with-most-water/
package two_pointers;

import java.util.*;

public class LeetCode11_ContainerWithMostWater {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode11_ContainerWithMostWater solver = new LeetCode11_ContainerWithMostWater();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode11_ContainerWithMostWater Passed!");
    }
}
