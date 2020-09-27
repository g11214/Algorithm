package solution;

import java.util.PriorityQueue;

/**
 * @author ：Tong
 * @date ：Created in 2020/5/9 15:46
 * @description：
 * @version: $
 */
public class Top_215FindKthLargest {
    public int solution(int[] nums, int k) {
        //k个小顶堆,比堆顶大的插入
        PriorityQueue<Integer> smallQueue = new PriorityQueue<>(k);

        for (int i = 0; i < k; i++) {
            smallQueue.offer(nums[i]);
        }
        for (int i = k; i < nums.length && !smallQueue.isEmpty(); i++) {
            if(nums[i] > smallQueue.peek()){
                smallQueue.poll();
                smallQueue.offer(nums[i]);
            }
        }
        return smallQueue.peek();
    }
}
