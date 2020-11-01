package SwordToOffer;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * @description: 给定一个数组和滑动窗口的大小，找出所有滑动窗口里数值的最大值。例如，如果输入数组{2,3,4,2,6,2,5,1}及滑动窗口的大小3，那么一共存在6个滑动窗口，
 * 他们的最大值分别为{4,4,6,6,6,5}；针对数组{2,3,4,2,6,2,5,1}的滑动窗口有以下6个： {[2,3,4],2,6,2,5,1}， {2,[3,4,2],6,2,5,1}， {2,3,[4,2,6],2,5,1}，
 * {2,3,4,[2,6,2],5,1}， {2,3,4,2,[6,2,5],1}，{2,3,4,2,6,[2,5,1]}。
 * @author: Tong
 * @date: 2020-04-06 20:03
 */
public class MaxInWindows {
    public ArrayList<Integer> solution(int[] num, int size) {
        if (num == null || size < 0) {
            return null;
        }
        ArrayList<Integer> list = new ArrayList<Integer>();
        if (size == 0) {
            return list;
        }

        int len = num.length;
        if (len < size) {
            return list;
        }
        int left = 0;
        int right = size - 1;

        PriorityQueue<Integer> queue = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });

        for (int i = 0; i < size; i++) {
            queue.offer(num[i]);
        }
        list.add(queue.peek());

        while (++right < len) {
            queue.offer(num[right]);
            queue.remove(num[left]);
            list.add(queue.peek());
            left++;
        }
        return list;
    }
}
