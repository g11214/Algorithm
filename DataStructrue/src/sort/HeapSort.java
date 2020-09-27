package sort;

import common.Util;

public class HeapSort implements Sort {
    Util utilT = new Util();

    @Override
    public void sortContr(int[] arr) {
        int len = arr.length;

        for (int size = len; size > 0; size--) {
            //建堆--len = 2*curr+2=>(len-2)/2=curr=>curr = len/2-1，curr为最后一个父节点
            for (int i = (size / 2) - 1; i >= 0; i--) {
                heapSort(arr, i, size);
            }
            //一轮完后，数组的最大值在堆顶
            //堆顶和堆底交换
            utilT.swap(arr, 0, size - 1);
        }
    }

    /**
     * @Description: TODO
     * @Param: [arr, currIndex, len]
     * @Return: void
     * @Date: 2019/11/4
     **/
    public void heapSort(int[] arr, int currIndex, int len) {
        if (currIndex < len) {
            int left = 2 * currIndex + 1;//左孩子
            int right = 2 * currIndex + 2;//右孩子

            int maxIndex = currIndex;
            /**
             * 如果左右孩子比当前节点大，则记录，3个当中取最大
             **/
            if (left < len) {
                if (arr[maxIndex] < arr[left]) {
                    maxIndex = left;
                }
            }
            if (right < len) {
                if (arr[maxIndex] < arr[right]) {
                    maxIndex = right;
                }
            }
            //如果父节点不是最大，则交换
            if (maxIndex != currIndex) {
                utilT.swap(arr, maxIndex, currIndex);
                heapSort(arr, maxIndex, len);
            }
        }
    }
}
