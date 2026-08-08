// https://leetcode.com/problems/single-number/
package bit_manipulation;

import java.util.*;

public class SingleNumber {
public int singleNumber(int[] nums) {
        int res = 0;
        for (int n : nums) res ^= n;
        return res;
    }
    public static void main(String[] args) {
        SingleNumber solver = new SingleNumber();
        assert solver.singleNumber(new int[]{2,2,1}) == 1;
        System.out.println("✅ SingleNumber Passed!");
    }
}
