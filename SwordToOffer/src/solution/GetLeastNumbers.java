package solution;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * @author ：Tong
 * @date ：Created in 2019/9/17 14:57
 * @description：输入n个整数，找出其中最小的K个数。例如输入4,5,1,6,2,7,3,8这8个数字，则最小的4个数字是1,2,3,4,。
 * @version: $
 */
public class GetLeastNumbers {
    public ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
        ArrayList<Integer> arr = new ArrayList<>();
        PriorityQueue pq = new PriorityQueue<Integer>(k, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2.compareTo(o1);
            }
        });
        for (int i = 0; i < input.length; i++) {
        }
        return arr;
    }
}
