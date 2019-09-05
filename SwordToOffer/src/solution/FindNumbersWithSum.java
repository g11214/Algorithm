package solution;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author ：Tong
 * @date ：Created in 2019/9/5 15:23
 * @description：输入一个递增排序的数组和一个数字S，在数组中查找两个数，使得他们的和正好是S，如果有多对数字的和等于S，输出两个数的乘积最小的。
 * @version: $
 */
public class FindNumbersWithSum {
    public ArrayList<Integer> findNumbersWithSum(int [] array,int sum) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for(int i = 0;i<array.length;i++){

            int target = sum - array[i];
            int mid = Arrays.binarySearch(array,i+1,array.length,target);
            if( mid< 0){
                continue;
            }else{
                arrayList.add(array[i]);
                arrayList.add(target);
                break;
            }
        }
        return  arrayList;
    }
}
