package solution;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @description: 给定一个 没有重复 数字的序列，返回其所有可能的全排列。
 * <p>
 * 示例:
 * <p>
 * 输入: [1,2,3]
 * 输出:
 * [
 * [1,2,3],
 * [1,3,2],
 * [2,1,3],
 * [2,3,1],
 * [3,1,2],
 * [3,2,1]
 * ]
 * @author: Tong
 * @date: 2020-04-18 22:01
 */
public class Top_46Permute {
    public List<List<Integer>> solution(int[] nums) {
        List<List<Integer>> allList = new ArrayList<>();
        List<Integer> tempList = new ArrayList<>();
        int len = nums.length;
        if (len == 1) {
            tempList.add(nums[0]);
        }
        allList.add(tempList);
        int subCount = len == 1 ? 1 : 0;

        for (int i = 0; i < allList.size(); i++) {
            List<Integer> currList = allList.get(i);
            if (currList.size() == len) {
                break;
            }
            for (int currNum : nums) {
                if (!currList.contains(currNum)) {
                    List<Integer> nextList = new ArrayList<>(currList);
                    nextList.add(currNum);
                    allList.add(nextList);
                    if (currList.size() == len - 1) {
                        subCount++;
                    }
                }
            }
        }

        return allList.subList(allList.size() - subCount, allList.size());
    }

    public List<List<Integer>> solution2(int[] nums) {
        List<List<Integer>> allList = new ArrayList<>();
        List<Integer> tempList = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            tempList.add(nums[i]);
        }
        backTrack(allList,tempList,0,nums.length);
        return allList;
    }

    public void backTrack(List<List<Integer>> allList, List<Integer> currList, int start, int len) {
        if (start == len) {
            allList.add(new ArrayList<>(currList));
        }

        for (int i = start; i < len; i++) {
            Collections.swap(currList, i, start);
            backTrack(allList, currList, start + 1, len);
            Collections.swap(currList, i, start);
        }

    }
}
