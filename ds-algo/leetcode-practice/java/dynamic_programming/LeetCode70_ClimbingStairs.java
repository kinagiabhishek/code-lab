package dynamic_programming;

public class LeetCode70_ClimbingStairs {
    public int climbStairs(int n) {
        if (n <= 2) return n;
        int a = 1, b = 2;
        for (int i = 3; i <= n; i++) {
            int c = a + b;
            a = b;
            b = c;
        }
        return b;
    }
    public static void main(String[] args) {
        LeetCode70_ClimbingStairs solver = new LeetCode70_ClimbingStairs();
        assert solver.climbStairs(2) == 2;
        assert solver.climbStairs(3) == 3;
        assert solver.climbStairs(5) == 8;
        System.out.println("✅ LeetCode70_ClimbingStairs Passed!");
    }
}
