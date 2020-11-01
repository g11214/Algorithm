package DataStructrue.sort;

/**
 * @description:
 * @author: Tong
 * @date: 2019-07-27 20:27
 */
public class InsertSort implements Sort {

    public void sortContr(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int curr = arr[i];
            int j;
            for (j = i - 1; j >= 0; j--) {
                if (arr[j] > curr) {
                    arr[j + 1] = arr[j];
                } else {
                    //前面没有比curr更大的元素，结束循环
                    break;
                }
            }
            arr[j + 1] = curr;
        }
    }
}
