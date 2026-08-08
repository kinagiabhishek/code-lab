// https://leetcode.com/problems/remove-element/
package two_pointers;

import java.util.*;

public class RemoveElement {
public int removeElement(int[] nums, int val) {
        int k = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) { nums[k] = nums[i]; k++; }
        }
        return k;
    }
    public static void main(String[] args) {
        RemoveElement solver = new RemoveElement();
        assert solver.removeElement(new int[]{3,2,2,3}, 3) == 2;
        System.out.println("✅ RemoveElement Passed!");
    }
}
