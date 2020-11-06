package swordtooffer;

import java.util.ArrayList;

public class SumList {
    public ArrayList<ArrayList<Integer>> FindContinuousSequence(int sum) {
        //(start+end)*len/2
        ArrayList<ArrayList<Integer>> totalList = new ArrayList<>();

        for (int len = 2; len < sum; len++) {
            int mid = sum / len;
            ArrayList<Integer> tempList = new ArrayList<>();

            if (sum % len == 0) {
                int count = 1;
                for (int start = mid - 1, end = mid + 1; start > 0; start--, end++) {
                    count += 2;
                    isEqual(start, end, len, sum, tempList, count);
                }
            } else {
                int count = 0;
                for (int start = mid, end = mid + 1; start > 0; start--, end++) {
                    count += 2;
                    isEqual(start, end, len, sum, tempList, count);
                }
            }
            if (!tempList.isEmpty()) {
                totalList.add(0, tempList);
            }
        }
        return totalList;
    }

    public void isEqual(int start, int end, int len, int sum, ArrayList<Integer> tempList, int count) {
        if ((start + end) * len == sum * 2 && (len == count)) {
            for (int i = start; i <= end; i++) {
                tempList.add(0, i);
            }
        }
    }

}
