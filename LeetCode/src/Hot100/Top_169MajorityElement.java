package Hot100;

import java.util.HashMap;
import java.util.Map;

/**
 * @author ：Tong
 * @date ：Created in 2020/4/13 16:41
 * @description：
 * @version: $
 */
public class Top_169MajorityElement {
    public int solution(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();

        int maxAppearVal = nums[0];
        int maxAppearValCount = 1;
        for (int i = 0; i < nums.length; i++) {
            int currCount = 0;
            if (map.containsKey(nums[i])) {
                currCount = map.get(nums[i]);
            }
            map.put(nums[i], currCount + 1);
            if (currCount + 1 > maxAppearValCount) {
                maxAppearValCount = currCount + 1;
                maxAppearVal = nums[i];
            }
        }
        return maxAppearVal;
    }
}
