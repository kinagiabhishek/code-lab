// https://leetcode.com/problems/powx-n/
package math;

import java.util.*;

public class PowXN {
public double myPow(double x, int n) {
        long N = n;
        if (N < 0) { x = 1 / x; N = -N; }
        double ans = 1, current_product = x;
        for (long i = N; i > 0; i /= 2) {
            if (i % 2 == 1) ans *= current_product;
            current_product *= current_product;
        }
        return ans;
    }
    public static void main(String[] args) {
        PowXN solver = new PowXN();
        assert Math.abs(solver.myPow(2.0, 10) - 1024.0) < 1e-5;
        System.out.println("✅ PowXN Passed!");
    }
}
