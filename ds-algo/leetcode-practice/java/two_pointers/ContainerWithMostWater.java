// https://leetcode.com/problems/container-with-most-water/
package two_pointers;

import java.util.*;

public class ContainerWithMostWater {
    public int maxArea(int[] height) {
        int l = 0, r = height.length - 1, max = 0;
        while (l < r) {
            int h = Math.min(height[l], height[r]); max = Math.max(max, h * (r - l));
            if (height[l] < height[r]) l++; else r--;
        }
        return max;
    }
}
