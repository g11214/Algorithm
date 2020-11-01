package DataStructrue.sort;

import common.Util;

/**
 * @description:
 * @author: Tong
 * @date: 2019-07-27 20:37
 */
public class ShellSort implements Sort {
    Util utilT = new Util();

    public void sortContr(int[] arr) {
        int len = arr.length;
        int gap = 1;

        while (gap < len / 3) {
            gap = gap * 3 + 1;
        }
        for (; gap >= 1; gap = (int) Math.floor(gap / 3)) {
            for (int j = 0; j < len - gap; j++) {
                for (int k = j + gap; k < len; ) {
                    if (arr[j] > arr[k]) {
                        utilT.swap(arr, j, k);
                    }
                    break;
                }
            }
        }
    }
}
