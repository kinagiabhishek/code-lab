// https://leetcode.com/problems/problem-graph-381/
package graphs;

import java.util.*;

public class LeetCode381_GraphProblem381 {
    public int solve(int n, int[][] edges) {
        int[] parent = new int[n];
        for (int i = 0; i < n; i++) parent[i] = i;
        int comps = n;
        for (int[] e : edges) {
            int p1 = find(parent, e[0]), p2 = find(parent, e[1]);
            if (p1 != p2) { parent[p1] = p2; comps--; }
        }
        return comps;
    }
    private int find(int[] p, int i) {
        if (p[i] == i) return i;
        return p[i] = find(p, p[i]);
    }
    public static void main(String[] args) {
        LeetCode381_GraphProblem381 solver = new LeetCode381_GraphProblem381();
        assert solver.solve(5, new int[][]{{0,1},{1,2},{3,4}}) == 2;
        System.out.println("✅ LeetCode381_GraphProblem381 Passed!");
    }
}
