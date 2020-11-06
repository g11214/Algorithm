package swordtooffer.Recursive;

/**
 * @description: 大家都知道斐波那契数列，现在要求输入一个整数n，请你输出斐波那契数列的第n项（从0开始，第0项为0）。
 * n<=39
 * @author: Tong
 * @date: 2020-03-23 20:52
 */
public class Fibonacci {
    public int solution(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else if (n >= 2) {
            return solution(n - 1) + solution(n - 2);
        } else {
            return -1;
        }
    }
}
