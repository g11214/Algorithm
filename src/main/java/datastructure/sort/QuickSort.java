package datastructure.sort;

import common.Util;

/**
 * @description:
 * @author: Tong
 * @date: 2019-07-27 20:28
 */
public class QuickSort implements Sort {
    Util utilT = new Util();


    public void sortContr(int[] arr) {
        quick(arr, 0, arr.length - 1);
    }

    public void quick(int[] arr, int left, int right) {
        if (left < right) {
            int mid = getMidAndSort(arr, left, right);
            quick(arr, left, mid);
            quick(arr, mid + 1, right);
        }
    }

    public int getMidAndSort(int[] arr, int left, int right) {
        int midValue = arr[left];

        int count = 0;
        int i = left + 1;
        while (i <= right) {
            if (arr[i] < midValue) {
                count++;
                if (i != left + count) {
                    //第几个比midValue小就放第几位
                    utilT.swap(arr, i, left + count);
                }
            }
            i++;
        }
        utilT.swap(arr, left + count, left);
        return left + count;
    }
}
