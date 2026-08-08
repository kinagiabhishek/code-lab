package hard;

import java.util.PriorityQueue;
import java.util.Collections;

/**
 * LeetCode 295: Find Median from Data Stream
 * Link: https://leetcode.com/problems/find-median-from-data-stream/
 * Difficulty: Hard
 */
public class FindMedianDataStream {
    public static class MedianFinder {
        private PriorityQueue<Integer> maxHeap; // stores smaller half
        private PriorityQueue<Integer> minHeap; // stores larger half

        public MedianFinder() {
            maxHeap = new PriorityQueue<>(Collections.reverseOrder());
            minHeap = new PriorityQueue<>();
        }

        public void addNum(int num) {
            maxHeap.add(num);
            minHeap.add(maxHeap.poll());
            if (maxHeap.size() < minHeap.size()) {
                maxHeap.add(minHeap.poll());
            }
        }

        public double findMedian() {
            if (maxHeap.size() > minHeap.size()) {
                return maxHeap.peek();
            }
            return (maxHeap.peek() + minHeap.peek()) / 2.0;
        }
    }

    public static void main(String[] args) {
        MedianFinder mf = new MedianFinder();
        mf.addNum(1);
        mf.addNum(2);
        assert mf.findMedian() == 1.5;
        mf.addNum(3);
        assert mf.findMedian() == 2.0;
        System.out.println("✅ FindMedianDataStream Test Passed!");
    }
}
