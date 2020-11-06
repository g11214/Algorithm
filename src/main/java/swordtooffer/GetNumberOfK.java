package swordtooffer;

/**
 * @author ：Tong
 * @date ：Created in 2019/9/5 10:05
 * @description：统计一个数字在排序数组中出现的次数。
 * @version: $
 */
public class GetNumberOfK {
    public int getNumberOfK(int[] array, int k) {
        int len = array.length;
        int count = 0;
        //Arrays.binarySearch(array, k);
        int re = dichotomizwe(array, 0, len - 1, k);
        if (re != -1) {
            int start = re - 1;
            int end = re + 1;
            count = 1;

            while (start >= 0) {
                if (array[start] == k) {
                    count++;
                    start--;
                } else {
                    break;
                }
            }
            while (end < len) {
                if (array[end] == k) {
                    count++;
                    end++;
                } else {
                    break;
                }
            }
        }
        return count;
    }

    public int dichotomizwe(int[] arr, int start, int end, int k) {
        if (start > end || k < arr[start] || k > arr[end]) {
            return -1;
        }
        int mid = (start + end) / 2;
        if (k < arr[mid]) {
            return dichotomizwe(arr, start, mid - 1, k);
        } else if (k > arr[mid]) {
            return dichotomizwe(arr, mid + 1, end, k);
        } else {
            return mid;
        }
    }
}
