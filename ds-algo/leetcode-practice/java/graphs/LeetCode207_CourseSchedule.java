// https://leetcode.com/problems/course-schedule/
package graphs;
import java.util.*;

public class LeetCode207_CourseSchedule {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        List<List<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < numCourses; i++) adj.add(new ArrayList<>());
        int[] inDegree = new int[numCourses];
        for (int[] p : prerequisites) {
            adj.get(p[1]).add(p[0]);
            inDegree[p[0]]++;
        }
        Queue<Integer> q = new LinkedList<>();
        for (int i = 0; i < numCourses; i++) if (inDegree[i] == 0) q.add(i);
        int count = 0;
        while (!q.isEmpty()) {
            int curr = q.poll();
            count++;
            for (int neighbor : adj.get(curr)) {
                inDegree[neighbor]--;
                if (inDegree[neighbor] == 0) q.add(neighbor);
            }
        }
        return count == numCourses;
    }
    public static void main(String[] args) {
        LeetCode207_CourseSchedule solver = new LeetCode207_CourseSchedule();
        assert solver.canFinish(2, new int[][]{{1, 0}}) == true;
        assert solver.canFinish(2, new int[][]{{1, 0}, {0, 1}}) == false;
        System.out.println("✅ LeetCode207_CourseSchedule Passed!");
    }
}
