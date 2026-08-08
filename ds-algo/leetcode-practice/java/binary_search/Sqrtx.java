// https://leetcode.com/problems/sqrtx/
package binary_search;

import java.util.*;

public class Sqrtx {
public int mySqrt(int x) {
        if (x == 0) return 0;
        int l = 1, r = x, res = 0;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (mid <= x / mid) { res = mid; l = mid + 1; }
            else r = mid - 1;
        }
        return res;
    }
    public static void main(String[] args) {
        Sqrtx solver = new Sqrtx();
        assert solver.mySqrt(4) == 2;
        System.out.println("✅ Sqrtx Passed!");
    }
}
