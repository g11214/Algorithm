package SwordToOffer;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * @description: 如何得到一个数据流中的中位数？如果从数据流中读出奇数个数值，那么中位数就是所有数值排序之后位于中间的数值。如果从数据流中读出偶数个数值，
 * 那么中位数就是所有数值排序之后中间两个数的平均值。我们使用Insert()方法读取数据流，使用GetMedian()方法获取当前读取数据的中位数。
 * @author: Tong
 * @date: 2020-04-06 19:33
 */
public class DataStreamMid {
    PriorityQueue<Integer> smallQueue = new PriorityQueue();
    PriorityQueue<Integer> bigQueue = new PriorityQueue<>(15, new Comparator<Integer>() {
        @Override
        public int compare(Integer o1, Integer o2) {
            return o2 - o1;
        }
    });

    private int count = 0;

    public void Insert(Integer num) {
        if (count % 2 == 0) {
            smallQueue.offer(num);
            bigQueue.offer(smallQueue.poll());
        } else {
            bigQueue.offer(num);
            smallQueue.offer(bigQueue.poll());
        }
        count++;
    }

    public Double GetMedian() {
        if (count % 2 == 0) {
            return (smallQueue.peek() + bigQueue.peek()) / 2.0;
        } else {
            return bigQueue.peek() / 1.0;
        }
    }
}
