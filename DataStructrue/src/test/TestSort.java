package test;
import common.Util;
import sort.ShellSort;
import sort.Sort;

/**
 * @description:
 * @author: Tong
 * @date: 2019-07-27 10:05
 */

public class TestSort {
    public static void main(String[] args) {
        int []arr = {23, 12, 57, 5, 98, 43, 16, 87, 33, 77};
        Util utilT = new Util();


//        SortImpl sort = new BubbleSort();
//        SortImpl sort = new InsertSort();
//        SortImpl sort = new SelectSort();
//        SortImpl sort = new QuickSort();
//        SortImpl sort = new MergeSort();
//        SortImpl sort = new HeapSort();
        Sort sort = new ShellSort();
        sort.sortContr(arr);

        utilT.print(arr, 5);
    }
}
