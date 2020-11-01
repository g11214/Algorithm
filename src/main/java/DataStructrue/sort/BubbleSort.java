package DataStructrue.sort;

import common.Util;

/**
 * @description: 冒泡排序
 * @author: Tong
 * @date: 2019-07-27 10:04
 */

public class BubbleSort implements Sort {
    Util utilT = new Util();

    /**
     * @param arr
     */

    public void sortContr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j + 1] < arr[j]) {
                    utilT.swap(arr, j, j + 1);
                }
            }
        }
    }
    /**
     * 优化版
     */
}
