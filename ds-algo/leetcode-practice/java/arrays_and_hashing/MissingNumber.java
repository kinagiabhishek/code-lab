// https://leetcode.com/problems/missing-number/
package arrays_and_hashing;

import java.util.*;

public class MissingNumber {
public int missingNumber(int[] nums) {
        int n = nums.length;
        int sum = n * (n + 1) / 2;
        for (int num : nums) sum -= num;
        return sum;
    }
    public static void main(String[] args) {
        MissingNumber solver = new MissingNumber();
        assert solver.missingNumber(new int[]{3,0,1}) == 2;
        System.out.println("✅ MissingNumber Passed!");
    }
}
