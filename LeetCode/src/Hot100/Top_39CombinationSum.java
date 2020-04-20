package Hot100;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ：Tong
 * @date ：Created in 2020/4/20 10:59
 * @description： 给定一个无重复元素的数组 candidates 和一个目标数 target ，找出 candidates 中所有可以使数字和为 target 的组合。
 * <p>
 * candidates 中的数字可以无限制重复被选取。
 * <p>
 * 说明：
 * <p>
 * 所有数字（包括 target）都是正整数。
 * 解集不能包含重复的组合。 
 * 示例 1:
 * <p>
 * 输入: candidates = [2,3,6,7], target = 7,
 * 所求解集为:
 * [
 * [7],
 * [2,2,3]
 * ]
 * 示例 2:
 * <p>
 * 输入: candidates = [2,3,5], target = 8,
 * 所求解集为:
 * [
 *   [2,2,2,2],
 *   [2,3,3],
 *   [3,5]
 * ]
 * @version: $
 */
public class Top_39CombinationSum {
    List<List<Integer>> allList = new ArrayList<>();

    public List<List<Integer>> solution(int[] candidates, int target) {
        List<Integer> tempList = new ArrayList<>();
        combin(candidates, tempList, target, 0);
        return allList;
    }

    public void combin(int[] candidates, List<Integer> tempList, int target, int start) {
        //不可能有负数
        if (target == 0) {
            allList.add(tempList);
            return;
        } else if (target < 0) {
            return;
        }
        for (int i = start; i < candidates.length; i++) {
            List<Integer> currList = new ArrayList<>(tempList);
            currList.add(candidates[i]);
            combin(candidates, currList, target - candidates[i], i);
        }
    }
}
