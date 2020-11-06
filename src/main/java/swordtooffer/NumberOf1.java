package swordtooffer;

/**
 * @description:
 * @author: Tong
 * @date: 2020-04-06 21:48
 */
public class NumberOf1 {
    public int solution(int n) {
        char[] binaryCrr = Integer.toBinaryString(n).toCharArray();
        int count = 0;
        for (char c :
                binaryCrr) {
            if (c == '1') {
                count++;
            }
        }
        return count;
    }
}
