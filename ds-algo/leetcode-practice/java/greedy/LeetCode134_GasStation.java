// https://leetcode.com/problems/gas-station/
package greedy;
public class LeetCode134_GasStation {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int totalGas = 0, totalCost = 0, currGas = 0, start = 0;
        for (int i = 0; i < gas.length; i++) {
            totalGas += gas[i]; totalCost += cost[i];
            currGas += gas[i] - cost[i];
            if (currGas < 0) { start = i + 1; currGas = 0; }
        }
        return totalGas >= totalCost ? start : -1;
    }
    public static void main(String[] args) {
        assert new LeetCode134_GasStation().canCompleteCircuit(new int[]{1,2,3,4,5}, new int[]{3,4,5,1,2}) == 3;
        System.out.println("✅ LeetCode134_GasStation Passed!");
    }
}
