package solution.Recursive;

/**
 * @description: 一只青蛙一次可以跳上1级台阶，也可以跳上2级……它也可以跳上n级。求该青蛙跳上一个n级的台阶总共有多少种跳法。
 * jump(n) = jump(1)+jump(2)+jump(3)+...+jump(n-2)+jump(n-1)--------1
 * jump(n-1) = jump(1)+jump(2)+jump(3)+...+jump(n-2)------2
 * 1-2=>
 * jump(n)-jump(n-1)= jump(n-1)
 * jump(n) = 2jump(n-1)
 * @author: Tong
 * @date: 2020-03-23 21:05
 */
public class JumpFloorII {
    public int solution(int target) {
        if (target == 1) {
            return 1;
        } else if (target == 2) {
            return 2;
        } else if (target > 2) {
            return 2 * solution(target - 1);
        } else {
            return -1;
        }
    }
}
