// https://leetcode.com/problems/majority-element/
package arrays_and_hashing;

import java.util.*;

public class MajorityElement {
public int majorityElement(int[] nums) {
        int count = 0, candidate = 0;
        for (int num : nums) {
            if (count == 0) candidate = num;
            count += (num == candidate) ? 1 : -1;
        }
        return candidate;
    }
    public static void main(String[] args) {
        MajorityElement solver = new MajorityElement();
        assert solver.majorityElement(new int[]{3,2,3}) == 3;
        System.out.println("✅ MajorityElement Passed!");
    }
}
