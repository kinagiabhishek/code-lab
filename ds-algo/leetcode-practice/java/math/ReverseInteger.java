// https://leetcode.com/problems/reverse-integer/
package math;

import java.util.*;

public class ReverseInteger {
public int reverse(int x) {
        long res = 0;
        while (x != 0) {
            res = res * 10 + x % 10;
            x /= 10;
        }
        return (res < Integer.MIN_VALUE || res > Integer.MAX_VALUE) ? 0 : (int) res;
    }
    public static void main(String[] args) {
        ReverseInteger solver = new ReverseInteger();
        assert solver.reverse(123) == 321;
        assert solver.reverse(-123) == -321;
        System.out.println("✅ ReverseInteger Passed!");
    }
}
