package solution;

import java.util.ArrayList;

/**
 * @description:
 * @author: Tong
 * @date: 2020-03-23 22:41
 */
public class GetUglyNumber {
    public int solution(int index) {
        if(index==0){
            return 0;
        }
        ArrayList<Integer> list = new ArrayList<>();
        int twoIndex = 0;
        int threeIndex = 0;
        int fiveIndex = 0;

        int currEglyNum = 1;
        list.add(currEglyNum);

        int count=1;
        while (count<index) {
            currEglyNum = min(list.get(twoIndex)*2,list.get(threeIndex)*3,list.get(fiveIndex)*5);
            list.add(currEglyNum);
            count++;
            if(currEglyNum==list.get(twoIndex)*2){
                twoIndex++;
            }
            if(currEglyNum==list.get(threeIndex)*3){
                threeIndex++;
            }
            if(currEglyNum==list.get(fiveIndex)*5){
                fiveIndex++;
            }
        }
        return list.get(index-1);
    }

    public int min(int a, int b, int c) {
        int min = a;
        if (min > b) {
            min = b;
        }
        if (min > c) {
            min = c;
        }
        return min;
    }
}
