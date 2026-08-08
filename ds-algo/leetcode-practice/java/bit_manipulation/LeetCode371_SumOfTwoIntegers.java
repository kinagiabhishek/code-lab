// https://leetcode.com/problems/sum-of-two-integers/
package bit_manipulation;
public class LeetCode371_SumOfTwoIntegers {
    public int getSum(int a, int b) {
        while (b != 0) {
            int carry = (a & b) << 1;
            a = a ^ b;
            b = carry;
        }
        return a;
    }
    public static void main(String[] args) {
        assert new LeetCode371_SumOfTwoIntegers().getSum(1, 2) == 3;
        System.out.println("✅ LeetCode371_SumOfTwoIntegers Passed!");
    }
}
