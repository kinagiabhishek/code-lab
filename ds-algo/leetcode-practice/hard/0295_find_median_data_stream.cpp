/**
 * LeetCode 295: Find Median from Data Stream
 * Link: https://leetcode.com/problems/find-median-from-data-stream/
 * Difficulty: Hard
 */

#include <iostream>
#include <queue>
#include <vector>
#include <cassert>

using namespace std;

class MedianFinder {
private:
    priority_queue<int> maxHeap; // stores smaller half
    priority_queue<int, vector<int>, greater<int>> minHeap; // stores larger half
public:
    MedianFinder() {}
    
    void addNum(int num) {
        maxHeap.push(num);
        minHeap.push(maxHeap.top());
        maxHeap.pop();
        if (maxHeap.size() < minHeap.size()) {
            maxHeap.push(minHeap.top());
            minHeap.pop();
        }
    }
    
    double findMedian() {
        if (maxHeap.size() > minHeap.size()) {
            return maxHeap.top();
        }
        return (maxHeap.top() + minHeap.top()) / 2.0;
    }
};

int main() {
    MedianFinder mf;
    mf.addNum(1);
    mf.addNum(2);
    assert(mf.findMedian() == 1.5);
    mf.addNum(3);
    assert(mf.findMedian() == 2.0);
    cout << "Test FindMedianDataStream Passed!" << endl;
    return 0;
}
