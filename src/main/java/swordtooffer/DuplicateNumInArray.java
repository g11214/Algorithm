package swordtooffer;

import java.util.HashSet;
import java.util.Set;

/**
 * @description:
 * @author: Tong
 * @date: 2020-04-06 22:22
 */
public class DuplicateNumInArray {
    public boolean solution(int numbers[], int length, int[] duplication) {
        if (numbers != null && numbers.length != 0) {
            Set<Integer> set = new HashSet<>();

            for (int num :
                    numbers) {
                if (!set.add(num)) {
                    duplication[0] = num;
                    return true;
                }
            }
        }

        duplication[0] = -1;
        return false;
    }
}
