// https://leetcode.com/problems/climbing-stairs/
package dynamic_programming;
public class LeetCode70_ClimbingStairs {
    public int climbStairs(int n) {
        if (n <= 2) return n;
        int a = 1, b = 2;
        for (int i = 3; i <= n; i++) { int c = a + b; a = b; b = c; }
        return b;
    }
    public static void main(String[] args) {
        assert new LeetCode70_ClimbingStairs().climbStairs(5) == 8;
        System.out.println("✅ LeetCode70_ClimbingStairs Passed!");
    }
}
