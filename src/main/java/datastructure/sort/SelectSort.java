package datastructure.sort;

import common.Util;

public class SelectSort implements Sort {
    Util utilT = new Util();

    public void sortContr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int min = i;

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[min] > arr[j]) {
                    min = j;
                }
            }
            if (min != i) {
                utilT.swap(arr, i, min);
            }
        }
    }
}
