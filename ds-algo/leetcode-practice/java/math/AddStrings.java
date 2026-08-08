// https://leetcode.com/problems/add-strings/
package math;

import java.util.*;

public class AddStrings {
public String addStrings(String num1, String num2) {
        StringBuilder sb = new StringBuilder();
        int i = num1.length() - 1, j = num2.length() - 1, carry = 0;
        while (i >= 0 || j >= 0 || carry != 0) {
            int n1 = i >= 0 ? num1.charAt(i) - '0' : 0;
            int n2 = j >= 0 ? num2.charAt(j) - '0' : 0;
            int sum = n1 + n2 + carry;
            sb.append(sum % 10);
            carry = sum / 10;
            i--; j--;
        }
        return sb.reverse().toString();
    }
    public static void main(String[] args) {
        AddStrings solver = new AddStrings();
        assert solver.addStrings("11", "123").equals("134");
        assert solver.addStrings("456", "77").equals("533");
        assert solver.addStrings("0", "0").equals("0");
        System.out.println("✅ AddStrings Passed!");
    }
}
