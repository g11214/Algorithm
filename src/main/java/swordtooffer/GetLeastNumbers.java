package swordtooffer;

import java.util.ArrayList;

/**
 * @author ：Tong
 * @date ：Created in 2019/9/17 14:57
 * @description：输入n个整数，找出其中最小的K个数。例如输入4,5,1,6,2,7,3,8这8个数字，则最小的4个数字是1,2,3,4,。
 * @version: $
 */
public class GetLeastNumbers {
    public ArrayList<Integer> GetLeastNumbers_Solution(int[] input, int k) {
        ArrayList<Integer> arr = new ArrayList<>();

        int len = input.length;
        if (k > len) {
            return arr;
        }
        for (int i = 0; i < k; i++) {
            //冒泡次数
            for (int j = 0; j < len - i - 1; j++) {
                //小则交换,一次冒泡，最小的在最后
                if (input[j] < input[j + 1]) {
                    int tempVal = input[j];
                    input[j] = input[j + 1];
                    input[j + 1] = tempVal;
                }
            }
            arr.add(input[len - i]);
        }
        return arr;
    }
}
