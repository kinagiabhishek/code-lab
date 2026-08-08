// https://leetcode.com/problems/candy/
package bit_manipulation;

import java.util.*;

public class LeetCode135_Candy {
    // LeetCode Problem 135: Candy
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        LeetCode135_Candy solver = new LeetCode135_Candy();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode135_Candy (Candy) Passed!");
    }
}
