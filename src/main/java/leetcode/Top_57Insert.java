package leetcode;

import java.util.ArrayList;
import java.util.List;

public class Top_57Insert {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        if (intervals == null || intervals.length == 0) {
            return new int[][]{newInterval};
        }
        int len = intervals.length;
        List<int[]> resList = new ArrayList<>();

        int left = 0;
        //右边界比target的左边界小的先加到list中，左边界比target右边界大的驾到list中
        //左边不重合的添加到list中
        while (left < len && intervals[left][1] < newInterval[0]) {
            resList.add(intervals[left++]);
        }
        while (left < len && intervals[left][0] <= newInterval[1]) {
            newInterval[0] = Math.min(newInterval[0], intervals[left][0]);
            newInterval[1] = Math.max(newInterval[1], intervals[left][1]);
            left++;
        }
        resList.add(newInterval);
        while (left < len) {
            resList.add(intervals[left++]);
        }
        return resList.toArray(new int[resList.size()][2]);
    }
}
