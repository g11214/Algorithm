package datastructure.sort;

/**
 * @description:
 * @author: Tong
 * @date: 2019-07-27 10:04
 */
public class MergeSort implements Sort {

    public void sortContr(int[] arr) {
        int mid = arr.length / 2;
        merge(arr, 0, arr.length - 1);
    }

    public void merge(int[] arr, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;
            merge(arr, left, mid);
            merge(arr, mid + 1, right);
            sort(arr, left, mid, right);
        }
    }

    public void sort(int[] arr, int left, int mid, int right) {
        int[] temp = new int[right - left + 1];

        int i = left;
        int j = mid + 1;
        int index = 0;
        while (i <= mid && j <= right) {
            if (arr[i] < arr[j]) {
                temp[index++] = arr[i++];
            } else {
                temp[index++] = arr[j++];
            }
        }
        while (i <= mid) {
            temp[index++] = arr[i++];
        }
        while (j <= right) {
            temp[index++] = arr[j++];
        }

        for (int k = 0; k < temp.length; k++) {
            arr[left + k] = temp[k];
        }
    }
}
